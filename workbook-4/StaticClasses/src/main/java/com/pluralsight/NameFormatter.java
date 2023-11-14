package com.pluralsight;

public class NameFormatter {

    //this class has no parameters bc this is a static class, parameters aren't needed
    //this constructor is private bc we dont want let anyone make a NameFormatter Object
    private NameFormatter() {

    }

    public static String format(String firstName, String lastName) {
       /* you can use this
        return lastName + ", " + firstName;
        or use the method String format that you made under this one*/
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName,
                                String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();

        sb.append(lastName).append(", ");

        //if the prefix is not empty, append a prefix
        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }

        sb.append(firstName);

        if (!middleName.isEmpty()) {
            sb.append(" ").append(middleName);
        }

        if (!suffix.isEmpty()) {
            sb.append(" ").append(suffix);
        }
        return sb.toString();
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(", ");
        String mainPart = parts[0];
        String suffix = parts.length > 1 ? parts[1] : "";
        //^this is same as this v
       /* if (parts.length > 1) {
            suffix = parts[1];
        } else {
            suffix = "";
        }*/
        String[] nameParts = mainPart.split(" ");

        String prefix = "";
        String firstName = "";
        String lastName = "";
        String middleName = "";

        switch (nameParts.length) {
            case 4:
                prefix = nameParts[0];
                firstName = nameParts[1];
                middleName = nameParts[2];
                lastName = nameParts[3];
                break;
            case 3:
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
                break;
            case 2:
                firstName = nameParts[0];
                lastName = nameParts[1];
                break;
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }
}