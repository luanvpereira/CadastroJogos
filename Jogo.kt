package com.example.logonrm.cadastrojogos

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by logonrm on 11/05/2018.
 */
data class Jogo(val nome: String,
                val genero: String,
                val anoLancamento: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(genero)
        parcel.writeInt(anoLancamento)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jogo> {
        override fun createFromParcel(parcel: Parcel): Jogo {
            return Jogo(parcel)
        }

        override fun newArray(size: Int): Array<Jogo?> {
            return arrayOfNulls(size)
        }
    }
}