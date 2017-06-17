package io.github.satr.aws.lambda.shoppingbot.entity;

public class BakeryDepartmentIntent {
    public static final String Name = "BakeryDepartment";

    public class Slot {
        public static final String Amount = "Amount";
        public static final String Product = "BakeryProduct";
        public static final String Unit = "BakeryDepartmentUnit";
    }
}