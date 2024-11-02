abstract class AbstractButtonClass {
    String caption;

    public abstract void buttonPress();

    public void SetCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }
}