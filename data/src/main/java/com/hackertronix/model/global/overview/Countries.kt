package com.hackertronix.model.global.overview

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
@Entity
data class Countries(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @field:Json(name = "Afghanistan")
    val afghanistan: String = "",
    @field:Json(name = "Aland Islands")
    val alandIslands: String = "",
    @field:Json(name = "Albania")
    val albania: String = "",
    @field:Json(name = "Algeria")
    val algeria: String = "",
    @field:Json(name = "American Samoa")
    val americanSamoa: String = "",
    @field:Json(name = "Andorra")
    val andorra: String = "",
    @field:Json(name = "Angola")
    val angola: String = "",
    @field:Json(name = "Anguilla")
    val anguilla: String = "",
    @field:Json(name = "Antarctica")
    val antarctica: String = "",
    @field:Json(name = "Antigua and Barbuda")
    val antiguaAndBarbuda: String = "",
    @field:Json(name = "Argentina")
    val argentina: String = "",
    @field:Json(name = "Armenia")
    val armenia: String = "",
    @field:Json(name = "Aruba")
    val aruba: String = "",
    @field:Json(name = "Australia")
    val australia: String = "",
    @field:Json(name = "Austria")
    val austria: String = "",
    @field:Json(name = "Azerbaijan")
    val azerbaijan: String = "",
    @field:Json(name = "Bahamas")
    val bahamas: String = "",
    @field:Json(name = "Bahrain")
    val bahrain: String = "",
    @field:Json(name = "Bangladesh")
    val bangladesh: String = "",
    @field:Json(name = "Barbados")
    val barbados: String = "",
    @field:Json(name = "Belarus")
    val belarus: String = "",
    @field:Json(name = "Belgium")
    val belgium: String = "",
    @field:Json(name = "Belize")
    val belize: String = "",
    @field:Json(name = "Benin")
    val benin: String = "",
    @field:Json(name = "Bermuda")
    val bermuda: String = "",
    @field:Json(name = "Bhutan")
    val bhutan: String = "",
    @field:Json(name = "Bolivia")
    val bolivia: String = "",
    @field:Json(name = "Bonaire, Saint Eustatius and Saba ")
    val bonaireSaintEustatiusAndSaba: String = "",
    @field:Json(name = "Bosnia and Herzegovina")
    val bosniaAndHerzegovina: String = "",
    @field:Json(name = "Botswana")
    val botswana: String = "",
    @field:Json(name = "Bouvet Island")
    val bouvetIsland: String = "",
    @field:Json(name = "Brazil")
    val brazil: String = "",
    @field:Json(name = "British Indian Ocean Territory")
    val britishIndianOceanTerritory: String = "",
    @field:Json(name = "British Virgin Islands")
    val britishVirginIslands: String = "",
    @field:Json(name = "Brunei")
    val brunei: String = "",
    @field:Json(name = "Bulgaria")
    val bulgaria: String = "",
    @field:Json(name = "Burkina Faso")
    val burkinaFaso: String = "",
    @field:Json(name = "Burundi")
    val burundi: String = "",
    @field:Json(name = "Cambodia")
    val cambodia: String = "",
    @field:Json(name = "Cameroon")
    val cameroon: String = "",
    @field:Json(name = "Canada")
    val canada: String = "",
    @field:Json(name = "Cape Verde")
    val capeVerde: String = "",
    @field:Json(name = "Cayman Islands")
    val caymanIslands: String = "",
    @field:Json(name = "Central African Republic")
    val centralAfricanRepublic: String = "",
    @field:Json(name = "Chad")
    val chad: String = "",
    @field:Json(name = "Chile")
    val chile: String = "",
    @field:Json(name = "Christmas Island")
    val christmasIsland: String = "",
    @field:Json(name = "Cocos Islands")
    val cocosIslands: String = "",
    @field:Json(name = "Colombia")
    val colombia: String = "",
    @field:Json(name = "Comoros")
    val comoros: String = "",
    @field:Json(name = "Cook Islands")
    val cookIslands: String = "",
    @field:Json(name = "Costa Rica")
    val costaRica: String = "",
    @field:Json(name = "Croatia")
    val croatia: String = "",
    @field:Json(name = "Cuba")
    val cuba: String = "",
    @field:Json(name = "Curacao")
    val curacao: String = "",
    @field:Json(name = "Cyprus")
    val cyprus: String = "",
    @field:Json(name = "Czech Republic")
    val czechRepublic: String = "",
    @field:Json(name = "Democratic Republic of the Congo")
    val democraticRepublicOfTheCongo: String = "",
    @field:Json(name = "Denmark")
    val denmark: String = "",
    @field:Json(name = "Djibouti")
    val djibouti: String = "",
    @field:Json(name = "Dominica")
    val dominica: String = "",
    @field:Json(name = "Dominican Republic")
    val dominicanRepublic: String = "",
    @field:Json(name = "East Timor")
    val eastTimor: String = "",
    @field:Json(name = "Ecuador")
    val ecuador: String = "",
    @field:Json(name = "Egypt")
    val egypt: String = "",
    @field:Json(name = "El Salvador")
    val elSalvador: String = "",
    @field:Json(name = "Equatorial Guinea")
    val equatorialGuinea: String = "",
    @field:Json(name = "Eritrea")
    val eritrea: String = "",
    @field:Json(name = "Estonia")
    val estonia: String = "",
    @field:Json(name = "Ethiopia")
    val ethiopia: String = "",
    @field:Json(name = "Falkland Islands")
    val falklandIslands: String = "",
    @field:Json(name = "Faroe Islands")
    val faroeIslands: String = "",
    @field:Json(name = "Fiji")
    val fiji: String = "",
    @field:Json(name = "Finland")
    val finland: String = "",
    @field:Json(name = "France")
    val france: String = "",
    @field:Json(name = "French Guiana")
    val frenchGuiana: String = "",
    @field:Json(name = "French Polynesia")
    val frenchPolynesia: String = "",
    @field:Json(name = "French Southern Territories")
    val frenchSouthernTerritories: String = "",
    @field:Json(name = "Gabon")
    val gabon: String = "",
    @field:Json(name = "Gambia")
    val gambia: String = "",
    @field:Json(name = "Georgia")
    val georgia: String = "",
    @field:Json(name = "Germany")
    val germany: String = "",
    @field:Json(name = "Ghana")
    val ghana: String = "",
    @field:Json(name = "Gibraltar")
    val gibraltar: String = "",
    @field:Json(name = "Greece")
    val greece: String = "",
    @field:Json(name = "Greenland")
    val greenland: String = "",
    @field:Json(name = "Grenada")
    val grenada: String = "",
    @field:Json(name = "Guadeloupe")
    val guadeloupe: String = "",
    @field:Json(name = "Guam")
    val guam: String = "",
    @field:Json(name = "Guatemala")
    val guatemala: String = "",
    @field:Json(name = "Guernsey")
    val guernsey: String = "",
    @field:Json(name = "Guinea")
    val guinea: String = "",
    @field:Json(name = "Guinea-Bissau")
    val guineaBissau: String = "",
    @field:Json(name = "Guyana")
    val guyana: String = "",
    @field:Json(name = "Haiti")
    val haiti: String = "",
    @field:Json(name = "Heard Island and McDonald Islands")
    val heardIslandAndMcDonaldIslands: String = "",
    @field:Json(name = "Honduras")
    val honduras: String = "",
    @field:Json(name = "Hong Kong")
    val hongKong: String = "",
    @field:Json(name = "Hungary")
    val hungary: String = "",
    @field:Json(name = "Iceland")
    val iceland: String = "",
    @field:Json(name = "India")
    val india: String = "",
    @field:Json(name = "Indonesia")
    val indonesia: String = "",
    @field:Json(name = "Iran")
    val iran: String = "",
    @field:Json(name = "Iraq")
    val iraq: String = "",
    @field:Json(name = "Ireland")
    val ireland: String = "",
    @field:Json(name = "Isle of Man")
    val isleOfMan: String = "",
    @field:Json(name = "Israel")
    val israel: String = "",
    @field:Json(name = "Italy")
    val italy: String = "",
    @field:Json(name = "Ivory Coast")
    val ivoryCoast: String = "",
    @field:Json(name = "Jamaica")
    val jamaica: String = "",
    @field:Json(name = "Japan")
    val japan: String = "",
    @field:Json(name = "Jersey")
    val jersey: String = "",
    @field:Json(name = "Jordan")
    val jordan: String = "",
    @field:Json(name = "Kazakhstan")
    val kazakhstan: String = "",
    @field:Json(name = "Kenya")
    val kenya: String = "",
    @field:Json(name = "Kiribati")
    val kiribati: String = "",
    @field:Json(name = "Kosovo")
    val kosovo: String = "",
    @field:Json(name = "Kuwait")
    val kuwait: String = "",
    @field:Json(name = "Kyrgyzstan")
    val kyrgyzstan: String = "",
    @field:Json(name = "Laos")
    val laos: String = "",
    @field:Json(name = "Latvia")
    val latvia: String = "",
    @field:Json(name = "Lebanon")
    val lebanon: String = "",
    @field:Json(name = "Lesotho")
    val lesotho: String = "",
    @field:Json(name = "Liberia")
    val liberia: String = "",
    @field:Json(name = "Libya")
    val libya: String = "",
    @field:Json(name = "Liechtenstein")
    val liechtenstein: String = "",
    @field:Json(name = "Lithuania")
    val lithuania: String = "",
    @field:Json(name = "Luxembourg")
    val luxembourg: String = "",
    @field:Json(name = "Macao")
    val macao: String = "",
    @field:Json(name = "Macedonia")
    val macedonia: String = "",
    @field:Json(name = "Madagascar")
    val madagascar: String = "",
    @field:Json(name = "Mainland China")
    val mainlandChina: String = "",
    @field:Json(name = "Malawi")
    val malawi: String = "",
    @field:Json(name = "Malaysia")
    val malaysia: String = "",
    @field:Json(name = "Maldives")
    val maldives: String = "",
    @field:Json(name = "Mali")
    val mali: String = "",
    @field:Json(name = "Malta")
    val malta: String = "",
    @field:Json(name = "Marshall Islands")
    val marshallIslands: String = "",
    @field:Json(name = "Martinique")
    val martinique: String = "",
    @field:Json(name = "Mauritania")
    val mauritania: String = "",
    @field:Json(name = "Mauritius")
    val mauritius: String = "",
    @field:Json(name = "Mayotte")
    val mayotte: String = "",
    @field:Json(name = "Mexico")
    val mexico: String = "",
    @field:Json(name = "Micronesia")
    val micronesia: String = "",
    @field:Json(name = "Moldova")
    val moldova: String = "",
    @field:Json(name = "Monaco")
    val monaco: String = "",
    @field:Json(name = "Mongolia")
    val mongolia: String = "",
    @field:Json(name = "Montenegro")
    val montenegro: String = "",
    @field:Json(name = "Montserrat")
    val montserrat: String = "",
    @field:Json(name = "Morocco")
    val morocco: String = "",
    @field:Json(name = "Mozambique")
    val mozambique: String = "",
    @field:Json(name = "Myanmar")
    val myanmar: String = "",
    @field:Json(name = "Namibia")
    val namibia: String = "",
    @field:Json(name = "Nauru")
    val nauru: String = "",
    @field:Json(name = "Nepal")
    val nepal: String = "",
    @field:Json(name = "Netherlands")
    val netherlands: String = "",
    @field:Json(name = "New Caledonia")
    val newCaledonia: String = "",
    @field:Json(name = "New Zealand")
    val newZealand: String = "",
    @field:Json(name = "Nicaragua")
    val nicaragua: String = "",
    @field:Json(name = "Niger")
    val niger: String = "",
    @field:Json(name = "Nigeria")
    val nigeria: String = "",
    @field:Json(name = "Niue")
    val niue: String = "",
    @field:Json(name = "Norfolk Island")
    val norfolkIsland: String = "",
    @field:Json(name = "North Korea")
    val northKorea: String = "",
    @field:Json(name = "Northern Mariana Islands")
    val northernMarianaIslands: String = "",
    @field:Json(name = "Norway")
    val norway: String = "",
    @field:Json(name = "Oman")
    val oman: String = "",
    @field:Json(name = "Pakistan")
    val pakistan: String = "",
    @field:Json(name = "Palau")
    val palau: String = "",
    @field:Json(name = "Palestinian Territory")
    val palestinianTerritory: String = "",
    @field:Json(name = "Panama")
    val panama: String = "",
    @field:Json(name = "Papua New Guinea")
    val papuaNewGuinea: String = "",
    @field:Json(name = "Paraguay")
    val paraguay: String = "",
    @field:Json(name = "Peru")
    val peru: String = "",
    @field:Json(name = "Philippines")
    val philippines: String = "",
    @field:Json(name = "Pitcairn")
    val pitcairn: String = "",
    @field:Json(name = "Poland")
    val poland: String = "",
    @field:Json(name = "Portugal")
    val portugal: String = "",
    @field:Json(name = "Puerto Rico")
    val puertoRico: String = "",
    @field:Json(name = "Qatar")
    val qatar: String = "",
    @field:Json(name = "Republic of the Congo")
    val republicOfTheCongo: String = "",
    @field:Json(name = "Reunion")
    val reunion: String = "",
    @field:Json(name = "Romania")
    val romania: String = "",
    @field:Json(name = "Russia")
    val russia: String = "",
    @field:Json(name = "Rwanda")
    val rwanda: String = "",
    @field:Json(name = "Saint Barthelemy")
    val saintBarthelemy: String = "",
    @field:Json(name = "Saint Helena")
    val saintHelena: String = "",
    @field:Json(name = "Saint Kitts and Nevis")
    val saintKittsAndNevis: String = "",
    @field:Json(name = "Saint Lucia")
    val saintLucia: String = "",
    @field:Json(name = "Saint Martin")
    val saintMartin: String = "",
    @field:Json(name = "Saint Pierre and Miquelon")
    val saintPierreAndMiquelon: String = "",
    @field:Json(name = "Saint Vincent and the Grenadines")
    val saintVincentAndTheGrenadines: String = "",
    @field:Json(name = "Samoa")
    val samoa: String = "",
    @field:Json(name = "San Marino")
    val sanMarino: String = "",
    @field:Json(name = "Sao Tome and Principe")
    val saoTomeAndPrincipe: String = "",
    @field:Json(name = "Saudi Arabia")
    val saudiArabia: String = "",
    @field:Json(name = "Senegal")
    val senegal: String = "",
    @field:Json(name = "Serbia")
    val serbia: String = "",
    @field:Json(name = "Seychelles")
    val seychelles: String = "",
    @field:Json(name = "Sierra Leone")
    val sierraLeone: String = "",
    @field:Json(name = "Singapore")
    val singapore: String = "",
    @field:Json(name = "Sint Maarten")
    val sintMaarten: String = "",
    @field:Json(name = "Slovakia")
    val slovakia: String = "",
    @field:Json(name = "Slovenia")
    val slovenia: String = "",
    @field:Json(name = "Solomon Islands")
    val solomonIslands: String = "",
    @field:Json(name = "Somalia")
    val somalia: String = "",
    @field:Json(name = "South Africa")
    val southAfrica: String = "",
    @field:Json(name = "South Georgia and the South Sandwich Islands")
    val southGeorgiaAndTheSouthSandwichIslands: String = "",
    @field:Json(name = "South Korea")
    val southKorea: String = "",
    @field:Json(name = "South Sudan")
    val southSudan: String = "",
    @field:Json(name = "Spain")
    val spain: String = "",
    @field:Json(name = "Sri Lanka")
    val sriLanka: String = "",
    @field:Json(name = "Sudan")
    val sudan: String = "",
    @field:Json(name = "Suriname")
    val suriname: String = "",
    @field:Json(name = "Svalbard and Jan Mayen")
    val svalbardAndJanMayen: String = "",
    @field:Json(name = "Swaziland")
    val swaziland: String = "",
    @field:Json(name = "Sweden")
    val sweden: String = "",
    @field:Json(name = "Switzerland")
    val switzerland: String = "",
    @field:Json(name = "Syria")
    val syria: String = "",
    @field:Json(name = "Taiwan")
    val taiwan: String = "",
    @field:Json(name = "Tajikistan")
    val tajikistan: String = "",
    @field:Json(name = "Tanzania")
    val tanzania: String = "",
    @field:Json(name = "Thailand")
    val thailand: String = "",
    @field:Json(name = "Togo")
    val togo: String = "",
    @field:Json(name = "Tokelau")
    val tokelau: String = "",
    @field:Json(name = "Tonga")
    val tonga: String = "",
    @field:Json(name = "Trinidad and Tobago")
    val trinidadAndTobago: String = "",
    @field:Json(name = "Tunisia")
    val tunisia: String = "",
    @field:Json(name = "Turkey")
    val turkey: String = "",
    @field:Json(name = "Turkmenistan")
    val turkmenistan: String = "",
    @field:Json(name = "Turks and Caicos Islands")
    val turksAndCaicosIslands: String = "",
    @field:Json(name = "Tuvalu")
    val tuvalu: String = "",
    @field:Json(name = "US")
    val uS: String = "",
    @field:Json(name = "U.S. Virgin Islands")
    val uSVirginIslands: String = "",
    @field:Json(name = "Uganda")
    val uganda: String = "",
    @field:Json(name = "Ukraine")
    val ukraine: String = "",
    @field:Json(name = "United Arab Emirates")
    val unitedArabEmirates: String = "",
    @field:Json(name = "United Kingdom")
    val unitedKingdom: String = "",
    @field:Json(name = "United States Minor Outlying Islands")
    val unitedStatesMinorOutlyingIslands: String = "",
    @field:Json(name = "Uruguay")
    val uruguay: String = "",
    @field:Json(name = "Uzbekistan")
    val uzbekistan: String = "",
    @field:Json(name = "Vanuatu")
    val vanuatu: String = "",
    @field:Json(name = "Vatican")
    val vatican: String = "",
    @field:Json(name = "Venezuela")
    val venezuela: String = "",
    @field:Json(name = "Vietnam")
    val vietnam: String = "",
    @field:Json(name = "Wallis and Futuna")
    val wallisAndFutuna: String = "",
    @field:Json(name = "Western Sahara")
    val westernSahara: String = "",
    @field:Json(name = "Yemen")
    val yemen: String = "",
    @field:Json(name = "Zambia")
    val zambia: String = "",
    @field:Json(name = "Zimbabwe")
    val zimbabwe: String = ""
)