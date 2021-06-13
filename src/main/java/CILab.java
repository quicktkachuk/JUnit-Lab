public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        int capitals = 0;

        for (int i = 0; i < this.myString.length(); i++) {
            if(Character.isUpperCase(this.myString.charAt(i)))
                capitals++;
        }
        if(capitals == 0 || capitals == this.myString.length() || (capitals == 1 && Character.isUpperCase(this.myString.charAt(0))))
            return true;
        else
            return false;
    }

}

