/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package captainfanatic.bites;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Convenience definitions for RecipeBookProvider
 */
public final class RecipeBook {
    public static final String AUTHORITY = "captainfanatic.provider.RecipeBook";

    // This class cannot be instantiated
    private RecipeBook() {}
    
    /**
     * Recipes table
     */
    public static final class Recipes implements BaseColumns {
        // This class cannot be instantiated
        private Recipes() {}

        /**
         * The content:// style URL for this table
         */
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/recipes");

        /**
         * The MIME type of {@link #CONTENT_URI} providing a directory of recipes.
         */
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.captainfanatic.recipe";

        /**
         * The MIME type of a {@link #CONTENT_URI} sub-directory of a single recipe.
         */
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.captainfanatic.recipe";

        /**
         * The default sort order for this table
         */
        public static final String DEFAULT_SORT_ORDER = "modified DESC";

        /**
         * The title of the recipe
         * <P>Type: TEXT</P>
         */
        public static final String TITLE = "title";

        /**
         * The recipe itself (in xml format)
         * <P>Type: TEXT</P>
         */
        public static final String RECIPE = "recipe";

        /**
         * The timestamp for when the recipe was created
         * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
         */
        public static final String CREATED_DATE = "created";

        /**
         * The timestamp for when the recipe was last modified
         * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
         */
        public static final String MODIFIED_DATE = "modified";
    }
    
    public static final class Ingredients implements BaseColumns {
        // This class cannot be instantiated
        private Ingredients() {}

        /**
         * The content:// style URL for this table
         */
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/ingredients");

        /**
         * The MIME type of {@link #CONTENT_URI} providing a directory of ingredients.
         */
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.captainfanatic.ingredient";

        /**
         * The MIME type of a {@link #CONTENT_URI} sub-directory of a single ingredient.
         */
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.captainfanatic.ingredient";

        /**
         * The default sort order for this table
         */
        public static final String DEFAULT_SORT_ORDER = "text ASC";

        /**
         * The ID of the recipe the ingredient belongs to
         * <P>Type: INTEGER</P>
         */
        public static final String RECIPE = "recipe_ID";

        /**
         * The text of the ingredient
         * <P>Type: TEXT</P>
         */
        public static final String TEXT = "text";
        
        /**
         * The checked state of the ingredient
         * <P>Type: INTEGER</P>
         */
        public static final String CHECKED = "checked";

        /**
         * The timestamp for when the recipe was created
         * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
         */
        public static final String CREATED_DATE = "created";

        /**
         * The timestamp for when the recipe was last modified
         * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
         */
        public static final String MODIFIED_DATE = "modified";
    }
    
    public static final class Methods implements BaseColumns {
        // This class cannot be instantiated
        private Methods() {}

        /**
         * The content:// style URL for this table
         */
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/methods");

        /**
         * The MIME type of {@link #CONTENT_URI} providing a directory of methods.
         */
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.captainfanatic.methods";

        /**
         * The MIME type of a {@link #CONTENT_URI} sub-directory of a single method.
         */
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.captainfanatic.method";

        /**
         * The default sort order for this table
         */
        public static final String DEFAULT_SORT_ORDER = "text ASC";

        /**
         * The recipe that the method belongs to
         * <P>Type: INTEGER</P>
         */
        public static final String RECIPE = "recipe_id";

         /**
         * The text of the method
         * <P>Type: TEXT</P>
         */
        public static final String TEXT = "text";

        /**
         * The timestamp for when the method was created
         * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
         */
        public static final String CREATED_DATE = "created";

        /**
         * The timestamp for when the method was last modified
         * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
         */
        public static final String MODIFIED_DATE = "modified";
    }
}
