package com.example.excercise1.data

import com.example.excercise1.R

object AttractionDataSource {
    fun getHouses() : List<AttractionInformation> {
        val attractionType = arrayListOf(
            AttractionInformation(1, "CN Tower", 0.0, 0.0, AttractionType.Attractions),
            AttractionInformation(2, "Casa Loma", 0.0,  0.0, AttractionType.Attractions),
            AttractionInformation(3, "ROM", 0.0, 0.0, AttractionType.Museum),
            AttractionInformation(4, "607 Westminster Court Bois-Francs-Sud, QC J0H 3G6", "$550000", R.drawable.logo, AttractionType.Detached),
            AttractionInformation(5, "476 Depot Street Highlands, BC V9B 6A6", "$4002200", R.drawable.logo, AttractionType.Detached),
            AttractionInformation(6, "949 Hillcrest St. Charny, QC G6X 3X5", "$430000", R.drawable.logo, AttractionType.Detached),
            AttractionInformation(7, "17 Charles St. Powell River, BC V8A 2V2", "$620000", R.drawable.logo, AttractionType.SemiDetached),
            AttractionInformation(8,"280 Lyme Lane Coaticook, QC J1A 3S9", "$240000", R.drawable.logo, AttractionType.SemiDetached),
            AttractionInformation(9, "430 North Bay Road Delhi, ON N4B 7T3", "$624000", R.drawable.logo, AttractionType.SemiDetached),
            AttractionInformation(10, "7592 E. Cherry Ave. Mount Pearl, LB A1N 3T3", "$324000", R.drawable.logo, AttractionType.Condo),
            AttractionInformation(11, "979 Cottage Drive Grand Falls, LB A2A 5Y0", "$522000", R.drawable.logo, AttractionType.Condo),
            AttractionInformation(12, "7 Temple Court Gloucester, ON K1B 4E3", "$253000", R.drawable.logo, AttractionType.Condo),
            AttractionInformation(13, "7172 Mulberry Dr. Enfield, NS B2T 6Y5", "$450000", R.drawable.logo, AttractionType.Townhouse),
            AttractionInformation(14,"8901 Oklahoma St. L'Île-Dorval, QC H9S 2K4", "$120000", R.drawable.logo, AttractionType.Townhouse),
            AttractionInformation(15, "8689 Valley St. Wellington, ON N0B 2M5", "$750000", R.drawable.logo, AttractionType.Townhouse),
        )

        return attractionType
    }

    fun getHouseByType(type: AttractionType?) : List<AttractionInformation> {
        return getHouses().filter { it.attractionType == type }
    }
}