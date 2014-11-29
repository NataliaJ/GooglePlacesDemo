package pl.nataliajablonska.nataliaplaces.networking;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Malgorzata Jablonska on 2014-11-29.
 */
public class GooglePlace {
    @SerializedName("formatted_address")
    private String address;

    private Geometry geometry;
    public String getAddress(){
        return address;
    }
    public double getLocationLat(){
        return geometry.location.lat;
    }
    public double getLocationLng(){
        return geometry.location.lng;
    }

    class Geometry{
        private Glocation location;
    }
    class Glocation{
        double lat;
        double lng;
    }
}

