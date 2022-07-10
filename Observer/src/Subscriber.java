public interface Subscriber<T> {
    public void listen(Events events, T details);
}
