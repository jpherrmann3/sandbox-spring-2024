package org.example.sandbox.fluentapi;

public class Widget {

    private double length;
    private double width;
    private double height;

    public static WidgetBuilder create() {
        return new WidgetBuilder();
    }

    public static final class WidgetBuilder {
        private final Widget widget;

        private WidgetBuilder() {
            widget = new Widget();
        }

        public WidgetBuilder withLength(double length) {
            this.widget.length = length;
            return this;
        }

        public WidgetBuilder withWidth(double width) {
            this.widget.width = width;
            return this;
        }

        public WidgetBuilder withHeight(double height) {
            this.widget.width = height;
            return this;
        }

    }

    @Override
    public String toString() {
        return "{" +
            " length='" + length + "'" +
            ", width='" + width + "'" +
            ", height='" + height + "'" +
            "}";
    }

}
