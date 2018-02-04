package chapter1.rest;


final public class Response {
    private String text;

    public Response(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
