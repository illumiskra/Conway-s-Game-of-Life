package Game1;

public enum Status {
    NONE, //1 (1 is either alive or nothing happens to the cell)
    BORN, //2 (2 is when the cell is changing its status)
    LIVE, //1
    DIED; //2

    public Status step1 (int around) {  //if this then change the cell status to ...
        switch (this) {
            case NONE : return (around == 3) ? BORN : NONE;
            case LIVE : return (around <= 1 || around >= 4) ? DIED : LIVE;
            default : return this;
        }
    }

    public Status step2 (){ // if this then change the cell status to this ...
        switch (this){
            case BORN : return LIVE;
            case DIED : return NONE;
            default : return this;
        }
    }
}
