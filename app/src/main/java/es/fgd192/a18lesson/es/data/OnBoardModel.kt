package es.fgd192.a18lesson.es.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OnBoardModel(
    var image: Int,
    var TeVi: String,
    var TeVi2: String
) : Parcelable