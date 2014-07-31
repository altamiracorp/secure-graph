package org.securegraph.id;

import org.securegraph.SecureGraphException;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIdGenerator implements IdGenerator {
    private Queue<String> ids = new LinkedList<String>();

    @Override
    public String nextId() {
        synchronized (ids) {
            if (ids.size() == 0) {
                throw new SecureGraphException("No ids in the queue to give out");
            }
            return ids.remove();
        }
    }

    public void push(String id) {
        ids.add(id);
    }
}
