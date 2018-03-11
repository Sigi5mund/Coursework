public enum Location {

    GROUNDFLOOR ("00"),
    FIRSTFLOOR ("10"),
    SECONDFLOOR("20"),
    THIRDFLOOR ("30"),
    RESTAURANT ("");



    private static String id;

    Location(String id) {
    }


    public static String getId(){
        return id;
    }
}
