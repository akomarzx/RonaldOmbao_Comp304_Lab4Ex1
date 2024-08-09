package com.example.excercise1.data

import android.os.Parcel
import android.os.Parcelable

class AttractionInformation(val attractionId : Int, val name: String, val latitude : Double, val longitude : Double, val attractionType: AttractionType) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readDouble(),
        parcel.readDouble(),
        AttractionType.valueOf(parcel.readString().toString())
    ) {
    }

    override fun describeContents(): Int {
        return 0;
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeDouble(latitude)
        dest.writeDouble(longitude)
        dest.writeString(name)
        dest.writeString(attractionType.name)
        dest.writeInt(attractionId)
    }

    companion object CREATOR : Parcelable.Creator<AttractionInformation> {
        override fun createFromParcel(parcel: Parcel): AttractionInformation {
            return AttractionInformation(parcel)
        }

        override fun newArray(size: Int): Array<AttractionInformation?> {
            return arrayOfNulls(size)
        }
    }

}
