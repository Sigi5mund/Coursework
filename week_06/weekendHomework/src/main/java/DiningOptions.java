public enum DiningOptions {


    BREAKFASTVEGAN(10.00),
    BREAKFASTCONTINENTAL(12.50),
    BREAKFASTSTANDARD(9.75),
    BREAKFASTKIDS(5.00),
    DINERVEGAN(15.50),
    DINERVEGETARIAN(15.50),
    DINERKIDS(7.25),
    DINERSETMENU(12.00);

    Double cost;

    DiningOptions(Double v) {

        cost = v;
    }

    public Double cost(){
        return this.cost;
    }

}
