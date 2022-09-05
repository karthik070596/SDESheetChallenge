package models;

public class Ladder extends ForeignEntity{
    private Type type;
    private Ladder(int from,int to)
    {
        super(Type.Ladders,from,to);
    }
    public static LadderBuilder createBuilder()
    {
        return new LadderBuilder();
    }
    public static class LadderBuilder
    {
        private int from;
        private int to;

        public int getFrom() {
            return from;
        }

        public Ladder.LadderBuilder setFrom(int from) {
            this.from = from;
            return this;
        }

        public int getTo() {
            return to;
        }

        public Ladder.LadderBuilder setTo(int to) {
            this.to = to;
            return this;
        }
        public Ladder Build()
        {
            if(this.to<=this.from)
                throw new RuntimeException("The ending position of ladder must be greater than ending position");
            Ladder ladder=new Ladder(this.from,this.to);
            return ladder;
        }
    }
}
