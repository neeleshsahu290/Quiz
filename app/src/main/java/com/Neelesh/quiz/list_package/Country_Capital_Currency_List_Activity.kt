package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class Country_Capital_Currency_List_Activity : AppCompatActivity() {

    lateinit var recyclercountycapitalcurrencyl : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofcountry = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Afghanistan" ,"Kabul" ,"Afghani"),
        Country_Capital_Currency("Albania" ,"Tirane" ,"Lek"),
        Country_Capital_Currency("Algeria" ,"Algiers" ,"Algerian Dinar"),
        Country_Capital_Currency("Andorra" ,"Andorra la Vella" ,"Euro"),
        Country_Capital_Currency("Angola" ,"Luanda" ,"Kwanza"),
        Country_Capital_Currency("Antigua & Barbuda" ,"Saint John's" ,"East Caribbean Dollar"),
        Country_Capital_Currency("Argentina" ,"Buenos Aires" ,"Argentine Peso"),
    Country_Capital_Currency("Armenia" ,"Yerevan" ,"Dram"),
    Country_Capital_Currency("Australia" ,"Canberra" ,"Australian Dollar"),
    Country_Capital_Currency("Austria" ,"Vienna" ,"Euro"),
    Country_Capital_Currency("Azerbaijan" ,"Baku" ,"Manat"),
    Country_Capital_Currency("The Bahamas" ,"Nassau" ,"Bahamian Dollar"),
    Country_Capital_Currency("Bahrain" ,"Manama" ,"Bahraini Dinar"),
    Country_Capital_Currency("Bangladesh" ,"Dhaka" ,"Taka"),
    Country_Capital_Currency("Barbados" ,"Bridgetown" ,"Barbadian Dollar"),
    Country_Capital_Currency("Belarus" ,"Minsk" ,"Belarusian Ruble"),
    Country_Capital_Currency("Belgium" ,"Brussels" ,"Euro"),
    Country_Capital_Currency("Belize" ,"Belmopan" ,"Belize Dollar"),
    Country_Capital_Currency("Benin" ,"Porto-Novo" ,"West African CFA Franc"),
    Country_Capital_Currency("Bhutan" ,"Thimphu" ,"Ngultrum"),
    Country_Capital_Currency("Bolivia" ,"La Paz; Sucre" ,"Boliviano"),
    Country_Capital_Currency("Bosnia and Herzegovina" ,"Sarajevo" ,"Convertible Mark"),
        Country_Capital_Currency("Botswana" ,"Gaborone" ,"Pula"),
                Country_Capital_Currency("Brazil" ,"Brasilia" ,"Real"),
                Country_Capital_Currency("Brunei" ,"Bandar Seri Begawan" ,"Brunei Dollar"),
                Country_Capital_Currency("Bulgaria" ,"Sofia" ,"Lev"),
                Country_Capital_Currency("Burkina Faso" ,"Ouagadougou" ,"West African CFA Franc"),
                Country_Capital_Currency("Burundi" ,"Bujumbura" ,"Burundi Franc"),
                Country_Capital_Currency("Cambodia" ,"Phnom Penh" ,"Riel"),
                Country_Capital_Currency("Cameroon" ,"Yaounde" ,"Central African CFA Franc"),
                Country_Capital_Currency("Canada" ,"Ottawa" ,"Canadian Dollar"),
                Country_Capital_Currency("Cape Verde" ,"Praia" ,"Cape Verdean Escudo"),
                Country_Capital_Currency("Central African Republic" ,"Bangui" ,"Central African CFA Franc"),
                Country_Capital_Currency("Chad" ,"N'Djamena" ,"Central African CFA Franc"),
                Country_Capital_Currency("Chile" ,"Santiago" ,"Chilean Peso"),
                Country_Capital_Currency("China" ,"Beijing" ,"Chinese Yuan"),
                Country_Capital_Currency("Colombia" ,"Bogota" ,"Colombian Peso"),
                Country_Capital_Currency("Comoros" ,"Moron" ,"Comorian Franc"),
                Country_Capital_Currency("Democratic Republic Of the Congo" ,"Kinshasa" ,"Congolese Franc"),
                Country_Capital_Currency("Republic of the Congo" ,"Brazzaville" ,"Central African CFA Franc"),
                Country_Capital_Currency("Costa Rica" ,"San Jose" ,"Colon"),
                Country_Capital_Currency("Cote d'Ivoire (Ivory Coast)" ,"Yamoussoukro; Abidjan" ,"West African CFA Franc"),
                Country_Capital_Currency("Croatia" ,"Zagreb" ,"Croatian"),
        Country_Capital_Currency("Cuba" ,"Havana" ,"Cuban Peso"),
                Country_Capital_Currency("Cyprus" ,"Nicosia" ,"Euro"),
                Country_Capital_Currency("Czechia" ,"Prague" ,"Czech Koruna"),
                Country_Capital_Currency("Denmark" ,"Copenhagen" ,"Danish Krone"),
                Country_Capital_Currency("Djibouti" ,"Djibouti" ,"Djiboutian Franc"),
                Country_Capital_Currency("Dominica" ,"Rosesau" ,"East Caribbean Dollar"),
                Country_Capital_Currency("Dominican Republic" ,"Santo Domingo" ,"Dominican Peso"),
                Country_Capital_Currency("East Timor (Timor-Leste)" ,"Dilli" ,"United States Dollar"),
                Country_Capital_Currency("Ecuador" ,"Quito" ,"United States Dollar"),
                Country_Capital_Currency("Egypt" ,"Cairo" ,"Egyptian Pound"),
                Country_Capital_Currency("El Salvador" ,"San Salvador" ,"United States Dollar"),
                Country_Capital_Currency("Equitorial Guinea" ,"Malabo" ,"Central African CFA Franc"),
                Country_Capital_Currency("Eritrea" ,"Asmara" ,"Nakfa"),
                Country_Capital_Currency("Estonia" ,"Tallinn" ,"Estonian Kroon; Euro"),
    Country_Capital_Currency("Ethiopia" ,"Addis Ababa" ,"Birr"),
    Country_Capital_Currency("Fiji" ,"Suva" ,"Fijian Dollar"),
    Country_Capital_Currency("Finland" ,"Helsinki" ,"Euro"),
    Country_Capital_Currency("France" ,"Paris" ,"Euro; CFP Franc"),
    Country_Capital_Currency("Gabon" ,"Libreville" ,"Central African CFA Franc"),
    Country_Capital_Currency("The Gambia" ,"Banjul" ,"Dalasi"),
    Country_Capital_Currency("Georgia" ,"Tbilisi" ,"Lari"),
    Country_Capital_Currency("Germany" ,"Berlin" ,"Euro"),
    Country_Capital_Currency("Ghana" ,"Accra" ,"Ghanaian Cedi"),
        Country_Capital_Currency("Greece" ,"Athens" ,"Euro"),
                Country_Capital_Currency("Grenada" ,"St. George's" ,"East Caribbean Dollar"),
                Country_Capital_Currency("Guatemala" ,"Guatemala City" ,"Quetzal"),
                Country_Capital_Currency("Guinea" ,"Conakry" ,"Guinean Franc"),
                Country_Capital_Currency("Guinea-Bissau" ,"Bissau" ,"West African CFA Franc"),
                Country_Capital_Currency("Guyana" ,"Georgetown" ,"Guyanese Dollar"),
                Country_Capital_Currency("Haiti" ,"Port-au-Prince" ,"Gourde"),
                Country_Capital_Currency("Honduras" ,"Tegucigalpa" ,"Lempira"),
                Country_Capital_Currency("Hungary" ,"Budapest" ,"Forint"),
                Country_Capital_Currency("Iceland" ,"Reykjavik" ,"Icelandic Krona"),
                Country_Capital_Currency("India" ,"New Delhi" ,"Indian Rupee"),
                Country_Capital_Currency("Indonesia" ,"Jakarta" ,"Rupiah"),
                Country_Capital_Currency("Iran" ,"Tehran" ,"Rial"),
                Country_Capital_Currency("Iraq" ,"Baghdad" ,"Iraqi Dinar"),
                Country_Capital_Currency("Republic of Ireland" ,"Dublin" ,"Euro"),
                Country_Capital_Currency("Israel" ,"Jerusalem" ,"Shekel"),
                Country_Capital_Currency("Italy" ,"Rome" ,"Euro"),
                Country_Capital_Currency("Jamaica" ,"Kingston" ,"Jamaican Dollar"),
                Country_Capital_Currency("Japan" ,"Tokyo" ,"Yen"),
                Country_Capital_Currency("Jordan" ,"Amman" ,"Jordanian Dinar"),
                Country_Capital_Currency("Kazakhstan" ,"Astana" ,"Tenge"),
                Country_Capital_Currency("Kenya" ,"Nairobi" ,"Kenyan Shilling"),
                Country_Capital_Currency("Kiribati" ,"Tarawa Atoll" ,"Kiribati Dollar"),
                Country_Capital_Currency("North Korea" ,"Pyongyang" ,"North Korean Won"),
                Country_Capital_Currency("South Korea" ,"Seoul" ,"South Korean Won"),
                Country_Capital_Currency("Kosovo" ,"Pristina" ,"Euro"),
                Country_Capital_Currency("Kuwait" ,"Kuwait City" ,"Kuwaiti Dollar"),
                Country_Capital_Currency("Kyrgyzstan" ,"Bishkek" ,"Som"),
                Country_Capital_Currency("Laos" ,"Vientiane" ,"Kip"),
                Country_Capital_Currency("Latvia" ,"Riga" ,"Lats"),
                Country_Capital_Currency("Lebanon" ,"Beirut" ,"Lebanese Pound"),
                Country_Capital_Currency("Lesotho" ,"Maseru" ,"Loti"),
                Country_Capital_Currency("Liberia", "Monrovia" ,"Liberian Dollar"),
                Country_Capital_Currency("Libya" ,"Tripoli" ,"Libyan Dinar"),
                Country_Capital_Currency("Liechtenstein" ,"Vaduz" ,"Swiss Franc"),
                Country_Capital_Currency("Lithuania" ,"Vilnius" ,"Lithuanian Litas"),
                Country_Capital_Currency("Luxembourg" ,"Luxembourg" ,"Euro"),
                Country_Capital_Currency("Macedonia" ,"Skopje" ,"Macedonian Denar"),
                Country_Capital_Currency("Madagascar" ,"Antananarivo" ,"Malagasy Ariary"),
                Country_Capital_Currency("Malawi" ,"Lilongwe Malawi" ,"Kwacha"),
                Country_Capital_Currency("Malaysia" ,"Kuala Lumpur" ,"Ringgit"),
                Country_Capital_Currency("Maldives" ,"Male" ,"Maldivian Rufiyaa"),
                Country_Capital_Currency("Mali" ,"Bamako" ,"West African CFA Franc"),
                Country_Capital_Currency("Malta" ,"Valletta" ,"Euro"),
                Country_Capital_Currency("Marshall Islands" ,"Majuro" ,"United States Dollar"),
                Country_Capital_Currency("Mauritania" ,"Nouakchott" ,"Ouguiya"),
                Country_Capital_Currency("Mauritius Port" ,"Louis" ,"Mauritian Rupee"),
                Country_Capital_Currency("Mexico" ,"Mexico City" ,"Mexican Peso"),
        Country_Capital_Currency("Federal States of Micronesia" ,"Palikir" ,"United States Dollar"),
                Country_Capital_Currency("Moldova" ,"Chisinau" ,"Moldovan Leu"),
                Country_Capital_Currency("Monaco" ,"Monaco" ,"Euro"),
                Country_Capital_Currency("Mongolia" ,"Ulaanbaatar" ,"Togrog"),
                Country_Capital_Currency("Montenegro" ,"Podgorica" ,"Euro"),
                Country_Capital_Currency("Morocco" ,"Rabat" ,"Moroccan Dirham"),
                Country_Capital_Currency("Mozambique" ,"Maputo" ,"Mozambican Metical"),
                Country_Capital_Currency("Myanmar (Burma)" ,"Nypyidaw" ,"Kyat"),
                Country_Capital_Currency("Namibia" ,"Windhoek" ,"Namibian Dollar"),
                Country_Capital_Currency("Nauru" ,"Yaren" ,"Australian Dollar"),
                Country_Capital_Currency("Nepal" ,"Kathmandu" ,"Nepalese Rupee"),
                Country_Capital_Currency("Netherlands" ,"Amsterdam; The Hague" ,"Euro"),
    Country_Capital_Currency("New Zealand" ,"Wellington" ,"New Zealand Dollar"),
    Country_Capital_Currency("Nicaragua" ,"Managua" ,"Cordoba"),
    Country_Capital_Currency("Niger" ,"Niamey" ,"West African CFA Franc"),
    Country_Capital_Currency("Nigeria" ,"Abuja" ,"Naira"),
    Country_Capital_Currency("Norway" ,"Oslo" ,"Norwegian Krone"),
    Country_Capital_Currency("Oman" ,"Muscat" ,"Omani Rial"),
    Country_Capital_Currency("Pakistan" ,"Islamabad" ,"Pakistani Rupee"),
    Country_Capital_Currency("Palau" ,"Melekeok" ,"United States Dollar"),
    Country_Capital_Currency("Panama" ,"Panama City" ,"Balboa"),
    Country_Capital_Currency("Papa New Guinea" ,"Port Moresby Papa" ,"Papa New Guinean Kina"),
    Country_Capital_Currency("Paraguay" ,"Asuncion" ,"Guarani"),
    Country_Capital_Currency("Peru" ,"Lima" ,"Nuevo Sol"),
    Country_Capital_Currency("Phillipines" ,"Manila" ,"Phillipine Peso"),
    Country_Capital_Currency("Poland" ,"Warsaw" ,"Zloty"),
    Country_Capital_Currency("Portugal" ,"Lisbon" ,"Euro"),
    Country_Capital_Currency("Qatar" ,"Doha" ,"Qatari Riyal"),
    Country_Capital_Currency("Romania" ,"Bucharest" ,"Romanian Rupee"),
    Country_Capital_Currency("Russia" ,"Moscow" ,"Ruble"),
    Country_Capital_Currency("Rwanda" ,"Kigali" ,"Rwandan Franc"),
    Country_Capital_Currency("Saint Kitts and Nevis" ,"Basseterre" ,"East Caribbean Dollar"),
    Country_Capital_Currency("Saint Lucia" ,"Castries" ,"East Caribbean Dollar"),
    Country_Capital_Currency("Saint Vincent and The Grenadines" ,"Kingstown East" ,"Caribbean Dollar"),
    Country_Capital_Currency("Samoa" ,"Apia" ,"Tala"),
    Country_Capital_Currency("San Marino" ,"San Marino" ,"Euro"),
    Country_Capital_Currency("Sao Tome and Principe" ,"Sao Tome" ,"Dobra"),
    Country_Capital_Currency("Saudi Arabia" ,"Riyadh" ,"Saudi Riyal"),
    Country_Capital_Currency("Senegal" ,"Dakar" ,"West African CFA Franc"),
    Country_Capital_Currency("Serbia" ,"Belgrade" ,"Serbian Dinar"),
    Country_Capital_Currency("Seychelles" ,"Victoria" ,"Seychoellois Rupee"),
    Country_Capital_Currency("Sierra Leone" ,"Freetown" ,"Leone"),
    Country_Capital_Currency("Singapore" ,"Singapore" ,"Singapore Dollar"),
    Country_Capital_Currency("Slovakia" ,"Bratislava" ,"Euro"),
    Country_Capital_Currency("Slovenia" ,"Ljubljana" ,"Euro"),
    Country_Capital_Currency("Solomon Islands" ,"Honiara" ,"Solomon Islands Dollar"),
    Country_Capital_Currency("Somalia" ,"Mogadishu" ,"Somali Shilling"),
    Country_Capital_Currency("South Africa" ,"Pretoria; Cape Town; Bloemfontein" ,"Rand"),
    Country_Capital_Currency("Spain" ,"Madrid" ,"Euro"),
    Country_Capital_Currency("Sri Lanka" ,"Colombo" ,"Sri Lankan Rupee"),
    Country_Capital_Currency("Sudan" ,"Khartoum" ,"Sudanese Pound"),
    Country_Capital_Currency("Suriname" ,"Paramaribo" ,"Surinamese Dollar"),
    Country_Capital_Currency("Swaziland" ,"Mbabane" ,"Lilangeni"),
    Country_Capital_Currency("Sweden" ,"Stockholm" ,"Swedish Krona"),
    Country_Capital_Currency("Switzerland" ,"Berne" ,"Swiss Franc"),
    Country_Capital_Currency("Syria" ,"Damascus" ,"Syrian Pound"),
    Country_Capital_Currency("Taiwan" ,"Taipei" ,"New Taiwan Dollar"),
    Country_Capital_Currency("Tajikistan" ,"Dushanbe" ,"Somoni"),
    Country_Capital_Currency("Tanzania" ,"Dar es Salaam; Dodoma" ,"Tanzanian Schilling"),
    Country_Capital_Currency("Thailand" ,"Bangkok" ,"Thai Baht"),
    Country_Capital_Currency("Togo" ,"Lome" ,"West African CFA Franc"),
    Country_Capital_Currency("Tonga" ,"Nuku'alofa" ,"Pa'anga"),
    Country_Capital_Currency("Trinidad and Tobago" ,"Port-of-Spain" ,"Trinidad and Tobago Dollar"),
    Country_Capital_Currency("Tunisia" ,"Tunis" ,"Tunisian Dinar"),
    Country_Capital_Currency("Turkey" ,"Ankara" ,"Turkish Lira"),
    Country_Capital_Currency("Turkmenistan" ,"Ashgabat" ,"Turkmen New Manat"),
    Country_Capital_Currency("Tuvalu" ,"Vaiaku" ,"Tuvaluan Dollar"),
    Country_Capital_Currency("Uganda" ,"Kampala" ,"Ugandan Shilling"),
    Country_Capital_Currency("Ukraine" ,"Kiev" ,"Hryvnia"),
    Country_Capital_Currency("United Arab Emirates" ,"Abu Dhabi" ,"Dirham"),
    Country_Capital_Currency("United Kingdom" ,"London" ,"Pound Sterling"),
    Country_Capital_Currency("United States of America" ,"Washington D.C." ,"United States Dollar"),
    Country_Capital_Currency("Uruguay" ,"Montevideo" ,"Uruguayan Peso"),
    Country_Capital_Currency("Uzbekistan" ,"Tashkent" ,"Uzbekistan Som"),
    Country_Capital_Currency("Vanuatu" ,"Port-Vila" ,"Vanuatu Vatu"),
    Country_Capital_Currency("Vatican City" ,"Vatican City" ,"Euro"),
    Country_Capital_Currency("Venezuela" ,"Caracas" ,"Bolivar Fuerte"),
    Country_Capital_Currency("Vietnam" ,"Hanoi" ,"Dong"),
    Country_Capital_Currency("Yemen" ,"Sanaa" ,"Yemeni Rial"),
    Country_Capital_Currency("Zambia" ,"Lusaka" ,"Zambian Kwacha"),
    Country_Capital_Currency("Zimbabwe" ,"Harare" ,"United States Dollar")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Countries And Their Capitals And Currencies"

        recyclercountycapitalcurrencyl=findViewById(R.id.recyclercountrycurrencylist)
        recyclercountycapitalcurrencyl.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofcountry)
        recyclercountycapitalcurrencyl.adapter = recyclerAdapter
        recyclercountycapitalcurrencyl.layoutManager =  layoutManager

    }
}