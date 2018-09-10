package com.examples.android.googleplacesgooglemaps.modules;

import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

public class PlaceInfo {

    private String address;
    private String name;
    private String phoneNumber;
    private String id;
    private Uri uri;
    private String attributions;
    private LatLng latLng;
    private float ratings;

    public PlaceInfo(String address, String name, String phoneNumber, String id,
                     Uri uri, String attributions, LatLng latLng, float ratings) {
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.uri = uri;
        this.attributions = attributions;
        this.latLng = latLng;
        this.ratings = ratings;
    }

    public PlaceInfo (){
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getAttributions() {
        return attributions;
    }

    public void setAttributions(String attributions) {
        this.attributions = attributions;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "PlaceInfo{" + "address='" + address + '\'' + ", name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", id='" + id + '\'' + ", uri=" + uri + ", attributions='" + attributions + '\'' + ", latLng=" + latLng + ", ratings=" + ratings + '}';
    }
}
