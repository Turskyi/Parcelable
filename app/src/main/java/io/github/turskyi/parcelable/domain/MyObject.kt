package io.github.turskyi.parcelable.domain

import android.os.Parcel
import android.os.Parcelable
data class MyObject(

    var s: String?,
    var i: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(s)
        parcel.writeInt(i)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyObject> {
        override fun createFromParcel(parcel: Parcel): MyObject {
            return MyObject(parcel)
        }

        override fun newArray(size: Int): Array<MyObject?> {
            return arrayOfNulls(size)
        }
    }
}
