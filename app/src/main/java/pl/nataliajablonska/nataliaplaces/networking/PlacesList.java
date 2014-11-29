package pl.nataliajablonska.nataliaplaces.networking;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Malgorzata Jablonska on 2014-11-29.
 */
public class PlacesList {
    @SerializedName("places")
    List<GooglePlace> places;
}
