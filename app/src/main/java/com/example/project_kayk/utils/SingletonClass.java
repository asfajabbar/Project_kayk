package com.example.project_kayk.utils;

import com.example.project_kayk.model.CakeProperties;

import java.util.ArrayList;

public class SingletonClass {

    public static SingletonClass instance = null;

    public static int totalPrice = 0;
    public static int spongePrice = 0;
    public static int fillingPrice = 0;
    public static int icingPrice = 0;
    public static int garnishPrice = 0;
    public static int layerPrice = 0;
    public static int tierPrice = 0;

    public static CakeProperties cakeProperties = new CakeProperties();

    public static ArrayList<CakeProperties> getPropertiesOneLayer()
    {

        ArrayList<CakeProperties> cakePropertiesArrayList = new ArrayList<>();
        cakePropertiesArrayList.add(new CakeProperties("", "One", "", "", "", "", "", "1layer"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "", "", "", "1"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "", "", "", "2"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "", "", "", "3"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "", "", "", "4"));

        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Vanilla", "", "", "5"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Chocolate", "", "", "6"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Strawberry", "", "", "7"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Vanilla", "", "", "8"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Chocolate", "", "", "9"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Strawberry", "", "", "10"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Vanilla", "", "", "14"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Chocolate", "", "", "15"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Strawberry", "", "", "16"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Vanilla", "", "", "11"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Chocolate", "", "", "12"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Strawberry", "", "", "13"));

        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Vanilla", "Chocolate Chips", "", "17"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Vanilla", "Sprinkles", "", "18"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Vanilla", "Strawberries", "", "20"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Vanilla", "Cherries", "", "19"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Chocolate", "Chocolate Chips", "", "21"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Chocolate", "Sprinkles", "", "22"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Chocolate", "Strawberries", "", "24"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Chocolate", "Cherries", "", "23"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Strawberry", "Chocolate Chips", "", "25"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Strawberry", "Sprinkles", "", "26"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Strawberry", "Strawberries", "", "28"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Chocolate", "", "Strawberry", "Cherries", "", "27"));

        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Vanilla", "Chocolate Chips", "", "29"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Vanilla", "Sprinkles", "", "30"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Vanilla", "Strawberries", "", "32"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Vanilla", "Cherries", "", "31"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Chocolate", "Chocolate Chips", "", "33"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Chocolate", "Sprinkles", "", "34"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Chocolate", "Strawberries", "", "36"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Chocolate", "Cherries", "", "35"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Strawberry", "Chocolate Chips", "", "37"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Strawberry", "Sprinkles", "", "38"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Strawberry", "Strawberries", "", "40"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Vanilla", "", "Strawberry", "Cherries", "", "39"));

        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Vanilla", "Chocolate Chips", "", "41"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Vanilla", "Sprinkles", "", "42"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Vanilla", "Strawberries", "", "44"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Vanilla", "Cherries", "", "43"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Chocolate", "Chocolate Chips", "", "45"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Chocolate", "Sprinkles", "", "46"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Chocolate", "Strawberries", "", "48"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Chocolate", "Cherries", "", "47"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Strawberry", "Chocolate Chips", "", "49"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Strawberry", "Sprinkles", "", "50"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Strawberry", "Strawberries", "", "52"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "Strawberry", "", "Strawberry", "Cherries", "", "51"));

        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Vanilla", "Chocolate Chips", "", "53"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Vanilla", "Sprinkles", "", "54"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Vanilla", "Strawberries", "", "56"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Vanilla", "Cherries", "", "55"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Chocolate", "Chocolate Chips", "", "57"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Chocolate", "Sprinkles", "", "58"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Chocolate", "Strawberries", "", "60"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Chocolate", "Cherries", "", "59"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Strawberry", "Chocolate Chips", "", "61"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Strawberry", "Sprinkles", "", "62"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Strawberry", "Strawberries", "", "64"));
        cakePropertiesArrayList.add(new CakeProperties("", "One", "RedVelvet", "", "Strawberry", "Cherries", "", "63"));

        //////////////////////////////////////////////////
        /////////////////// Two Layers ///////////////////
        //////////////////////////////////////////////////

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "", "", "", "", "", "1"));

        //list
        //Sponges

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "", "", "", "", "2a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "", "", "", "", "3a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "", "", "", "", "5a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "", "", "", "", "4a"));
        //Fillings
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "", "", "", "6a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "", "", "", "7a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "", "", "", "8a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "", "", "", "9a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "", "", "", "10a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "", "", "", "11a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "", "", "", "12a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "", "", "", "13a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "", "", "", "14a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "", "", "", "15a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "", "", "", "16a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "", "", "", "17a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "", "", "", "18a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "", "", "", "19a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "", "", "", "20a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "", "", "", "21a"));
        //Icing
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Vanilla", "", "", "22a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Chocolate", "", "", "23a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Strawberry", "", "", "24a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Vanilla", "", "", "25a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Chocolate", "", "", "26a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Strawberry", "", "", "27a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Vanilla", "", "", "28a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Chocolate", "", "", "29a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Strawberry", "", "", "30a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Vanilla", "", "", "31a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Chocolate", "", "", "32a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Strawberry", "", "", "33a"));

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Vanilla", "", "", "34a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Chocolate", "", "", "35a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Strawberry", "", "", "36a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Vanilla", "", "", "37a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Chocolate", "", "", "38a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Strawberry", "", "", "39a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Vanilla", "", "", "40a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Chocolate", "", "", "41a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Strawberry", "", "", "42a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Vanilla", "", "", "43a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Chocolate", "", "", "44a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Strawberry", "", "", "45a"));

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Vanilla", "", "", "46a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Chocolate", "", "", "47a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Strawberry", "", "", "48a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Vanilla", "", "", "49a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Chocolate", "", "", "50a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Strawberry", "", "", "51a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Vanilla", "", "", "52a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Chocolate", "", "", "53a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Strawberry", "", "", "54a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Vanilla", "", "", "55a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Chocolate", "", "", "56a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Strawberry", "", "", "57a"));

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Vanilla", "", "", "58a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Chocolate", "", "", "59a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Strawberry", "", "", "60a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Vanilla", "", "", "61a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Chocolate", "", "", "62a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Strawberry", "", "", "63a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Vanilla", "", "", "64a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Chocolate", "", "", "65a"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Strawberry", "","", "66"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Vanilla", "", "", "67"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Chocolate", "", "", "68"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Strawberry", "", "", "69"));

        //ChocolateSpongeGarnish

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Vanilla", "Chocolate Chips", "", "70"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Vanilla", "Sprinkles", "", "71"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Vanilla", "Strawberries", "", "72"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Vanilla", "Cherries", "", "73"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Chocolate", "Chocolate Chips", "", "74"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Chocolate", "Sprinkles", "", "75"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Chocolate", "Strawberries", "", "76"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Chocolate", "Cherries", "", "77"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Strawberry", "Chocolate Chips", "", "78"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Strawberry", "Sprinkles", "", "79"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Strawberry", "Strawberries", "", "80"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Chocolate", "Strawberry", "Cherries", "", "81"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Vanilla", "Chocolate Chips", "", "82"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Vanilla", "Sprinkles", "", "83"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Vanilla", "Strawberries", "", "84"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Vanilla", "Cherries", "", "85"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Chocolate", "Chocolate Chips", "", "86"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Chocolate", "Sprinkles", "", "87"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Chocolate", "Strawberries", "", "88"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Chocolate", "Cherries", "", "89"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Strawberry", "Chocolate Chips", "", "90"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Strawberry", "Sprinkles", "", "91"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Strawberry", "Strawberries", "", "92"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Vanilla", "Strawberry", "Cherries", "", "93"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Vanilla", "Chocolate Chips", "", "94"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Vanilla", "Sprinkles", "", "95"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Vanilla", "Strawberries", "", "96"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Vanilla", "Cherries", "", "97"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Chocolate", "Chocolate Chips", "", "98"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Chocolate", "Sprinkles", "", "99"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Chocolate", "Strawberries", "", "100"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Chocolate", "Cherries", "", "101"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Strawberry", "Chocolate Chips", "", "102"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Strawberry", "Sprinkles", "", "103"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Strawberry", "Strawberries", "", "104"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Strawberry", "Strawberry", "Cherries", "", "105"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Vanilla", "Chocolate Chips", "", "106"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Vanilla", "Sprinkles", "", "107"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Vanilla", "Strawberries", "", "108"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Vanilla", "Cherries", "", "109"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Chocolate", "Chocolate Chips", "", "110"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Chocolate", "Sprinkles", "", "111"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Chocolate", "Strawberries", "", "112"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Chocolate", "Cherries", "", "113"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Strawberry", "Chocolate Chips", "", "114"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Strawberry", "Sprinkles", "", "115"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Strawberry", "Strawberries", "", "116"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Chocolate", "Peanut Butter", "Strawberry", "Cherries", "", "117"));

        //VanillaSpongeGarnish

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Vanilla", "Chocolate Chips", "", "118"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Vanilla", "Sprinkles", "", "119"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Vanilla", "Strawberries", "", "120"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Vanilla", "Cherries", "", "121"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Chocolate", "Chocolate Chips", "", "122"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Chocolate", "Sprinkles", "", "123"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Chocolate", "Strawberries", "", "124"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Chocolate", "", "Cherries", "125"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Strawberry", "Chocolate Chips", "", "126"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Strawberry", "Sprinkles", "", "127"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Strawberry", "Strawberries", "", "128"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Chocolate", "Strawberry", "Cherries", "", "129"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Vanilla", "Chocolate Chips", "", "130"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Vanilla", "Sprinkles", "", "131"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Vanilla", "Strawberries", "", "132"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Vanilla", "Cherries", "", "133"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Chocolate", "Chocolate Chips", "", "134"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Chocolate", "Sprinkles", "", "135"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Chocolate", "Strawberries", "", "136"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Chocolate", "Cherries", "", "137"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Strawberry", "Chocolate Chips", "", "138"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Strawberry", "Sprinkles", "", "139"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Strawberry", "Strawberries", "", "140"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Vanilla", "Strawberry", "Cherries", "", "141"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Vanilla", "Chocolate Chips", "", "142"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Vanilla", "Sprinkles", "", "143"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Vanilla", "Strawberries", "", "144"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Vanilla", "Cherries", "", "145"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Chocolate", "Chocolate Chips", "", "146"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Chocolate", "Sprinkles", "", "147"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Chocolate", "Strawberries", "", "148"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Chocolate", "Cherries", "", "149"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Strawberry", "Chocolate Chips", "", "150"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Strawberry", "Sprinkles", "", "151"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Strawberry", "Strawberries", "", "152"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Strawberry", "Strawberry", "Cherries", "", "153"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Vanilla", "Chocolate Chips", "", "154"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Vanilla", "Sprinkles", "", "155"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Vanilla", "Strawberries", "", "156"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Vanilla", "Cherries", "", "157"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Chocolate", "Chocolate Chips", "", "158"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Chocolate", "Sprinkles", "", "159"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Chocolate", "Strawberries", "", "160"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Chocolate", "Cherries", "", "161"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Strawberry", "Chocolate Chips", "", "162"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Strawberry", "Sprinkles", "", "163"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Strawberry", "Strawberries", "", "164"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Vanilla", "Peanut Butter", "Strawberry", "Cherries", "", "165"));

        //StrawberrySponge

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Vanilla", "Chocolate Chips", "", "166"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Vanilla", "Sprinkles", "", "167"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Vanilla", "Strawberries", "", "168"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Vanilla", "Cherries", "", "169"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Chocolate", "Chocolate Chips", "", "170"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Chocolate", "Sprinkles", "", "171"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Chocolate", "Strawberries", "", "172"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Chocolate", "Cherries", "", "173"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Strawberry", "Chocolate Chips", "", "174"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Strawberry", "Sprinkles", "", "175"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Strawberry", "Strawberries", "", "176"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Chocolate", "Strawberry", "Cherries", "", "177"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Vanilla", "Chocolate Chips", "", "178"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Vanilla", "Sprinkles", "", "179"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Vanilla", "Strawberries", "", "180"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Vanilla", "Cherries", "", "181"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Chocolate", "Chocolate Chips", "", "182"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Chocolate", "Sprinkles", "", "183"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Chocolate", "Strawberries", "", "184"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Chocolate", "Cherries", "", "185"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Strawberry", "Chocolate Chips", "", "186"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Strawberry", "Sprinkles", "", "187"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Strawberry", "Strawberries", "", "188"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Vanilla", "Strawberry", "Cherries", "", "189"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Vanilla", "Chocolate Chips", "", "190"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Vanilla", "Sprinkles", "", "191"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Vanilla", "Strawberries", "", "192"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Vanilla", "Cherries", "", "193"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Chocolate", "Chocolate Chips", "", "194"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Chocolate", "Sprinkles", "", "195"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Chocolate", "Strawberries", "", "196"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry", "Chocolate", "Cherries", "", "197"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry",  "Strawberry", "Chocolate Chips","", "198"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry",  "Strawberry", "Sprinkles", "","199"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry",  "Strawberry", "Strawberries","", "200"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Strawberry",  "Strawberry", "Cherries","",  "201"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Vanilla", "Chocolate Chips", "", "202"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Vanilla", "Sprinkles", "", "203"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Vanilla", "Strawberries", "", "204"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Vanilla", "Cherries", "", "205"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Chocolate", "Chocolate Chips", "", "206"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Chocolate", "Sprinkles", "", "207"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Chocolate", "Strawberries", "", "208"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Chocolate", "Cherries", "", "209"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Strawberry", "Chocolate Chips", "", "210"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Strawberry", "Sprinkles", "", "211"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Strawberry", "Strawberries", "", "212"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "Strawberry", "Peanut Butter", "Strawberry", "Cherries", "", "213"));


        //RedvelvetSponge

        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Vanilla", "Chocolate Chips", "", "214"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Vanilla", "Sprinkles", "", "215"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Vanilla", "Strawberries", "", "216"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Vanilla", "Cherries", "", "217"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Chocolate", "Chocolate Chips", "", "218"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Chocolate", "Sprinkles", "", "219"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Chocolate", "Strawberries", "", "220"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Chocolate", "Cherries", "", "221"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Strawberry", "Chocolate Chips", "", "222"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Strawberry", "Sprinkles", "", "223"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Strawberry", "Strawberries", "", "224"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Chocolate", "Strawberry", "Cherries", "", "225"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Vanilla", "Chocolate Chips", "", "226"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Vanilla", "Sprinkles", "", "227"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Vanilla", "Strawberries", "", "228"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Vanilla", "Cherries", "", "229"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Chocolate", "Chocolate Chips", "", "230"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Chocolate", "Sprinkles", "", "231"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Chocolate", "Strawberries", "", "232"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Chocolate", "Cherries", "", "233"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Strawberry", "Chocolate Chips","", "234"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Strawberry", "Sprinkles","", "235"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Strawberry", "Strawberries","", "236"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Vanilla", "Strawberry", "Cherries", "","237"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Vanilla", "Chocolate Chips", "", "238"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Vanilla", "Sprinkles", "", "239"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Vanilla", "Strawberries", "", "240"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Vanilla", "Cherries", "", "241"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Chocolate", "Chocolate Chips", "", "242"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Chocolate", "Sprinkles", "", "243"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Chocolate", "Strawberries", "", "244"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Chocolate", "Cherries", "", "245"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Strawberry", "Chocolate Chips", "", "246"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Strawberry", "Sprinkles", "", "247"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Strawberry", "Strawberries", "", "248"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Strawberry", "Strawberry", "Cherries", "", "249"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Vanilla", "Chocolate Chips", "", "250"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Vanilla", "Sprinkles", "", "251"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Vanilla", "Strawberries", "", "252"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Vanilla", "Cherries", "", "253"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Chocolate", "Chocolate Chips", "", "254"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Chocolate", "Sprinkles", "", "255"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Chocolate", "Strawberries", "", "256"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Chocolate", "Cherries", "", "257"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Strawberry", "Chocolate Chips", "", "258"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Strawberry", "Sprinkles", "", "259"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Strawberry", "Strawberries", "", "260"));
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "RedVelvet", "Peanut Butter", "Strawberry", "Cherries", "", "261"));



        return cakePropertiesArrayList;

    }

    public static ArrayList<CakeProperties> getPropertiesTwoLayer() {

        ArrayList<CakeProperties> cakePropertiesArrayList = new ArrayList<>();

        //please fill this function with list
        cakePropertiesArrayList.add(new CakeProperties("", "Two", "", "", "", "", "", "1"));

        return cakePropertiesArrayList;

    }

        synchronized public static SingletonClass getInstance()
    {
        if (instance == null)
        {
            instance = new SingletonClass();
            return instance;
        }
        else
            return instance;
    }

}
