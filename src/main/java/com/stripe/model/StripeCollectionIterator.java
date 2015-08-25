package com.stripe.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import com.stripe.Stripe;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

public class StripeCollectionIterator<T extends HasId> extends APIResource implements Iterator<T> {
	private final String url;
	
	@SuppressWarnings("rawtypes")
	private final Class<? extends StripeCollectionInterface> collectionType;
	
	private StripeCollectionInterface<T> currentCollection;
	private Iterator<T> currentDataIterator;
	
	private String lastId;
	
	StripeCollectionIterator(final StripeCollectionInterface<T> stripeCollection) {
        this.url = Stripe.getApiBase() + stripeCollection.getUrl();
        
		this.collectionType = stripeCollection.getClass();
		
		this.currentCollection = stripeCollection;
		this.currentDataIterator = stripeCollection.getData().iterator();
	}

	@Override
	public boolean hasNext() {
		return 
			currentDataIterator.hasNext() ||
			currentCollection.getHasMore();
	}

	@Override
	public T next() {
		if (currentDataIterator.hasNext()) {
			final T next =
				currentDataIterator.next();
			
			this.lastId = 
				next.getId();
			
			return currentDataIterator.next();
			
		} else if (currentCollection.getHasMore()) {
			try {
				this.currentCollection =
					list(Collections.<String, Object>singletonMap("starting_after", lastId), null);
				
				this.currentDataIterator =
					currentCollection.getData().iterator();
				
				return next();
			} catch (final Exception e) {
				throw new RuntimeException("Unable to lazy-load stripe objects", e);
			}
			
		} else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	protected StripeCollectionInterface<T> list(
		final Map<String, Object> params, 
		final RequestOptions options
	) throws Exception {
		return APIResource.request(RequestMethod.GET, url, params, collectionType, options);
	}
}
