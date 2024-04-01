package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result.append(evenElements.peek());
            }
            evenElements.poll();
        }
        return String.valueOf(result);
    }

    public String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        while (!descendingElements.isEmpty()) {
            result.append(descendingElements.pollLast());
        }
        return String.valueOf(result);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}