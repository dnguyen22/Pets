package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Don on 6/11/2017.
 */

/**
 * API Contract for the Pets app.
 */
public final class PetContract {

    // Prevent someone from accidentally instantiating the contract class
    private PetContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents as single pet.
     */
    public static class PetEntry implements BaseColumns {

        /** Name of database table for pets */
        public static final String TABLE_NAME = "pets";

        /**
         * Unique ID number for the p et (only for use in the database table).
         *
         * Type: INTEGER
         */
        public static final String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         *
         * Type: TEXT
         */
        public static final String COLUMN_PET_NAME = "name";

        /**
         * Breed of the pet.
         *
         * Type: TEXT
         */
        public static final String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet.
         *
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         *
         * Type: INTEGER
         */
        public static final String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet.
         *
         * Type: INTEGER
         */
        public static final String COLUMN_WEIGHT = "weight";

        /**
         * Possible values for the gender.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
