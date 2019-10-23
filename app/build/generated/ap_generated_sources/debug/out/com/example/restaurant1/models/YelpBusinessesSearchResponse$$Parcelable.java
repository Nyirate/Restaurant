
package com.example.restaurant1.models;

import java.util.ArrayList;
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
public class YelpBusinessesSearchResponse$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.restaurant1.models.YelpBusinessesSearchResponse>
{

    private com.example.restaurant1.models.YelpBusinessesSearchResponse yelpBusinessesSearchResponse$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<YelpBusinessesSearchResponse$$Parcelable>CREATOR = new Creator<YelpBusinessesSearchResponse$$Parcelable>() {


        @Override
        public YelpBusinessesSearchResponse$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new YelpBusinessesSearchResponse$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public YelpBusinessesSearchResponse$$Parcelable[] newArray(int size) {
            return new YelpBusinessesSearchResponse$$Parcelable[size] ;
        }

    }
    ;

    public YelpBusinessesSearchResponse$$Parcelable(com.example.restaurant1.models.YelpBusinessesSearchResponse yelpBusinessesSearchResponse$$2) {
        yelpBusinessesSearchResponse$$0 = yelpBusinessesSearchResponse$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(yelpBusinessesSearchResponse$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.restaurant1.models.YelpBusinessesSearchResponse yelpBusinessesSearchResponse$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(yelpBusinessesSearchResponse$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(yelpBusinessesSearchResponse$$1));
            if (yelpBusinessesSearchResponse$$1 .getTotal() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(yelpBusinessesSearchResponse$$1 .getTotal());
            }
            com.example.restaurant1.models.Region$$Parcelable.write(yelpBusinessesSearchResponse$$1 .getRegion(), parcel$$1, flags$$0, identityMap$$0);
            if (yelpBusinessesSearchResponse$$1 .getBusinesses() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(yelpBusinessesSearchResponse$$1 .getBusinesses().size());
                for (com.example.restaurant1.models.Business business$$0 : yelpBusinessesSearchResponse$$1 .getBusinesses()) {
                    com.example.restaurant1.models.Business$$Parcelable.write(business$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.restaurant1.models.YelpBusinessesSearchResponse getParcel() {
        return yelpBusinessesSearchResponse$$0;
    }

    public static com.example.restaurant1.models.YelpBusinessesSearchResponse read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.restaurant1.models.YelpBusinessesSearchResponse yelpBusinessesSearchResponse$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            yelpBusinessesSearchResponse$$4 = new com.example.restaurant1.models.YelpBusinessesSearchResponse();
            identityMap$$1 .put(reservation$$0, yelpBusinessesSearchResponse$$4);
            int int$$0 = parcel$$3 .readInt();
            Integer integer$$0;
            if (int$$0 < 0) {
                integer$$0 = null;
            } else {
                integer$$0 = parcel$$3 .readInt();
            }
            yelpBusinessesSearchResponse$$4 .setTotal(integer$$0);
            Region region$$0 = com.example.restaurant1.models.Region$$Parcelable.read(parcel$$3, identityMap$$1);
            yelpBusinessesSearchResponse$$4 .setRegion(region$$0);
            int int$$1 = parcel$$3 .readInt();
            ArrayList<com.example.restaurant1.models.Business> list$$0;
            if (int$$1 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new ArrayList<com.example.restaurant1.models.Business>(int$$1);
                for (int int$$2 = 0; (int$$2 <int$$1); int$$2 ++) {
                    com.example.restaurant1.models.Business business$$1 = com.example.restaurant1.models.Business$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$0 .add(business$$1);
                }
            }
            yelpBusinessesSearchResponse$$4 .setBusinesses(list$$0);
            com.example.restaurant1.models.YelpBusinessesSearchResponse yelpBusinessesSearchResponse$$3 = yelpBusinessesSearchResponse$$4;
            identityMap$$1 .put(identity$$1, yelpBusinessesSearchResponse$$3);
            return yelpBusinessesSearchResponse$$3;
        }
    }

}
