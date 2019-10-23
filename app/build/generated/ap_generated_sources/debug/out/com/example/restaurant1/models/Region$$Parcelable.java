
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
public class Region$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.restaurant1.models.Region>
{

    private com.example.restaurant1.models.Region region$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Region$$Parcelable>CREATOR = new Creator<Region$$Parcelable>() {


        @Override
        public Region$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Region$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Region$$Parcelable[] newArray(int size) {
            return new Region$$Parcelable[size] ;
        }

    }
    ;

    public Region$$Parcelable(com.example.restaurant1.models.Region region$$2) {
        region$$0 = region$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(region$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.restaurant1.models.Region region$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(region$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(region$$1));
            com.example.restaurant1.models.Center$$Parcelable.write(region$$1 .getCenter(), parcel$$1, flags$$0, identityMap$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.restaurant1.models.Region getParcel() {
        return region$$0;
    }

    public static com.example.restaurant1.models.Region read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.restaurant1.models.Region region$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            region$$4 = new com.example.restaurant1.models.Region();
            identityMap$$1 .put(reservation$$0, region$$4);
            Center center$$0 = com.example.restaurant1.models.Center$$Parcelable.read(parcel$$3, identityMap$$1);
            region$$4 .setCenter(center$$0);
            com.example.restaurant1.models.Region region$$3 = region$$4;
            identityMap$$1 .put(identity$$1, region$$3);
            return region$$3;
        }
    }

}
