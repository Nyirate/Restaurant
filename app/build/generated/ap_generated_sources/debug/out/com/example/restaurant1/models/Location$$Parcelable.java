
package com.example.restaurant1.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Location$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.restaurant1.models.Location>
{

    private com.example.restaurant1.models.Location location$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Location$$Parcelable>CREATOR = new Creator<Location$$Parcelable>() {


        @Override
        public Location$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Location$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Location$$Parcelable[] newArray(int size) {
            return new Location$$Parcelable[size] ;
        }

    }
    ;

    public Location$$Parcelable(com.example.restaurant1.models.Location location$$2) {
        location$$0 = location$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(location$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.restaurant1.models.Location location$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(location$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(location$$1));
            parcel$$1 .writeString(location$$1 .getCountry());
            parcel$$1 .writeString(location$$1 .getZipCode());
            parcel$$1 .writeString(location$$1 .getAddress3());
            parcel$$1 .writeString(location$$1 .getCity());
            parcel$$1 .writeString(location$$1 .getAddress2());
            parcel$$1 .writeString(location$$1 .getAddress1());
            parcel$$1 .writeString(location$$1 .getState());
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.restaurant1.models.Location getParcel() {
        return location$$0;
    }

    public static com.example.restaurant1.models.Location read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.restaurant1.models.Location location$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            location$$4 = new com.example.restaurant1.models.Location();
            identityMap$$1 .put(reservation$$0, location$$4);
            location$$4 .setCountry(parcel$$3 .readString());
            location$$4 .setZipCode(parcel$$3 .readString());
            location$$4 .setAddress3(parcel$$3 .readString());
            location$$4 .setCity(parcel$$3 .readString());
            location$$4 .setAddress2(parcel$$3 .readString());
            location$$4 .setAddress1(parcel$$3 .readString());
            location$$4 .setState(parcel$$3 .readString());
            com.example.restaurant1.models.Location location$$3 = location$$4;
            identityMap$$1 .put(identity$$1, location$$3);
            return location$$3;
        }
    }

}
