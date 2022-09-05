package models;

public class Snake extends ForeignEntity{
    private Type type;
    private Snake(int from,int to)
    {
        super(Type.Snakes,from,to);
    }
    public static SnakeBuilder createBuilder()
    {
        return new SnakeBuilder();
    }
    public static class SnakeBuilder
    {
        private int from;
        private int to;

        public int getFrom() {
            return from;
        }

        public SnakeBuilder setFrom(int from) {
            this.from = from;
            return this;
        }

        public int getTo() {
            return to;
        }

        public SnakeBuilder setTo(int to) {
            this.to = to;
            return this;
        }
        public Snake Build()
        {
            if(this.to>=this.from)
                throw new RuntimeException("The starting position of snake must be greater than ending position");
            Snake snake=new Snake(this.from,this.to);
            return snake;
        }
    }
}
