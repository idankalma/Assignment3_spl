package bgu.spl.net.srv;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.poi.ss.formula.functions.T;

import java.util.Map;

public class ConnectionsImpl implements Connections<T> {
    private final Map<Integer, ConnectionHandler<T>> clientHandlers = new ConcurrentHashMap<>();

    
}
