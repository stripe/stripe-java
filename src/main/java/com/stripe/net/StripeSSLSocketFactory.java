package com.stripe.net;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Wraps a SSLSocketFactory and enables more TLS versions
 */
public class StripeSSLSocketFactory extends SSLSocketFactory {
    private final SSLSocketFactory under;

    public StripeSSLSocketFactory(SSLSocketFactory under) {
        this.under = under;
    }

    private Socket fixupSocket(Socket sock) {
        if (!(sock instanceof SSLSocket)) {
            return sock;
        }

        SSLSocket sslSock = (SSLSocket) sock;

        String[] protos = sslSock.getEnabledProtocols();
        String[] newProtos = new String[protos.length + 1];
        newProtos[0] = "TLSv1.2";
        System.arraycopy(protos, 0, newProtos, 1, protos.length);

        sslSock.setEnabledProtocols(newProtos);
        return sslSock;
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return this.under.getDefaultCipherSuites();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return this.under.getSupportedCipherSuites();
    }

    @Override
    public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
        return fixupSocket(this.under.createSocket(s, host, port, autoClose));
    }

    @Override
    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        return fixupSocket(this.under.createSocket(host, port));
    }

    @Override
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
        return fixupSocket(this.under.createSocket(host, port, localHost, localPort));
    }

    @Override
    public Socket createSocket(InetAddress host, int port) throws IOException {
        return fixupSocket(this.under.createSocket(host, port));
    }

    @Override
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        return fixupSocket(this.under.createSocket(address, port, localAddress, localPort));
    }
}
