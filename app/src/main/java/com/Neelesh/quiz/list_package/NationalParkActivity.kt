package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class NationalParkActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(
        State_Capital("Anamudi Shola National Park" ,"Kerala"),
                State_Capital("Anshi National Park", "Karnataka"),
                State_Capital("Balphakram National Park" ,"Meghalaya"),
                State_Capital("Bandhavgarh National Park" ,"Madhya Pradesh"),
                State_Capital("Bandipur National Park" ,"Karnataka"),
                State_Capital("Bannerghatta National Park" ,"Karnataka"),
                State_Capital("Betla National Park" ,"Jharkhand"),
                State_Capital("Bhitarkanika National Park" ,"Odisha"),
                State_Capital("Bison (Rajbari) National Park" ,"Tripura"),
                State_Capital("Blackbuck National Park Velavadar" ,"Gujarat"),
                State_Capital("Buxa Tiger Reserve" ,"West Bengal"),
                State_Capital("Campbell Bay National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Chandoli National Park","Maharashtra"),
                State_Capital("Clouded Leopard National Park" ,"Tripura"),
                State_Capital("Dachigam National Park" ,"Jammu and Kashmir"),
                State_Capital("Desert National Park" ,"Rajasthan"),
                State_Capital("Dibru-Saikhowa National Park" ,"Assam"),
                State_Capital("Dudhwa National Park" ,"Uttar Pradesh"),
                State_Capital("Eravikulam National Park" ,"Kerala"),
                State_Capital("Galathea National Park" ,"Andaman and Nicobar Islands"),
        State_Capital("Gangotri National Park" ,"Uttarakhand"),
                State_Capital("Gir Forest National Park" ,"Gujarat"),
                State_Capital("Gorumara National Park" ,"West Bengal"),
                State_Capital("Govind Pashu Vihar Wildlife Sanctuary" ,"Uttarakhand"),
                State_Capital("Great Himalayan National Park" ,"Himachal Pradesh"),
        State_Capital("Gugamal National Park" ,"Maharashtra"),
                State_Capital("Guindy National Park" ,"Tamil Nadu"),
                State_Capital("Gulf of Mannar Marine National Park" ,"Tamil Nadu"),
                State_Capital("Guru Ghasidas (Sanjay) National Park" ,"Chhattisgarh"),
                State_Capital("Hemis National Park" ,"Jammu and Kashmir"),
                State_Capital("Inderkilla National Park" ,"Himachal Pradesh"),
                State_Capital("Indra Gandhi Wildlife Sanctuary and National Park" ,"Tamil Nadu"),
                State_Capital("Indravati National Park" ,"Chhattisgarh"),
                State_Capital("Jaldapara National Park" ,"West Bengal"),
                State_Capital("Jim Corbett National Park" ,"Uttarakhand"),
                State_Capital("Kalesar National Park" ,"Haryana"),
                State_Capital("Kanha National Park" ,"Madhya Pradesh"),
                State_Capital("Kanger Ghati National Park" ,"Chhattisgarh"),
                State_Capital("Kasu Brahmananda Reddy National Park" ,"Telangana"),
                State_Capital("Kaziranga National Park" ,"Assam"),
                State_Capital("Keibul Lamjao National Park" ,"Manipur"),
                State_Capital("Keoladeo National Park" ,"Rajasthan"),
                State_Capital("Khangchendzonga National Park" ,"Sikkim"),
                State_Capital("Khirganga National Park" ,"Himachal Pradesh"),
        State_Capital("Kishtwar National Park" ,"Jammu and Kashmir"),
                State_Capital("Kudremukh National Park" ,"Karnataka"),
                State_Capital("Madhav National Park" ,"Madhya Pradesh"),
                State_Capital("Mahatma Gandhi Marine National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Mahavir Harina Vanasthali National Park" ,"Telangana"),
                State_Capital("Manas National Park" ,"Assam"),
                State_Capital("Mandla Plant Fossils National Park" ,"Madhya Pradesh"),
                State_Capital("Marine National Park, Gulf of Kutch" ,"Gujarat"),
                State_Capital("Mathikettan Shola National Park" ,"Kerala"),
                State_Capital("Middle Button Island National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Mollem National Park" ,"Goa"),
                State_Capital("Mouling National Park" ,"Arunachal Pradesh"),
                State_Capital("Mount Abu Wildlife Sanctuary" ,"Rajasthan"),
                State_Capital("Mount Harriet National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Mrugavani National Park" ,"Telangana"),
                State_Capital("Mudumalai National Park" ,"Tamil Nadu"),
                State_Capital("Mukundra Hills National Park" ,"Rajasthan"),
                State_Capital("Mukurthi National Park" ,"Tamil Nadu"),
                State_Capital("Murlen National Park" ,"Mizoram"),
                State_Capital("Nagarhole National Park" ,"Karnataka"),
                State_Capital("Namdapha National Park" ,"Arunachal Pradesh"),
                State_Capital("Nameri National Park" ,"Assam"),
                State_Capital("Nanda Devi National Park" ,"Uttarakhand"),
                State_Capital("Navegaon National Park" ,"Maharashtra"),
        State_Capital("Neora Valley National Park" ,"West Bengal"),
                State_Capital("Nokrek National Park" ,"Meghalaya"),
                State_Capital("North Button Island National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Ntangki National Park" ,"Nagaland"),
                State_Capital("Orang National Park" ,"Assam"),
                State_Capital("Pambadum Shola National Park" ,"Kerala"),
                State_Capital("Panna National Park" ,"Madhya Pradesh"),
                State_Capital("Papikonda National Park" ,"Andhra Pradesh"),
                State_Capital("Pench National Park [3]" ,"Madhya Pradesh"),
                State_Capital("Periyar National Park" ,"Kerala"),
                State_Capital("Phawngpui Blue Mountain National Park" ,"Mizoram"),
                State_Capital("Pin Valley National Park" ,"Himachal Pradesh"),
                State_Capital("Rajaji National Park", "Uttarakhand"),
                State_Capital("Rani Jhansi Marine National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Ranthambore National Park" ,"Rajasthan"),
                State_Capital("Saddle Peak National Park" ,"Andaman and Nicobar Islands"),
                State_Capital("Salim Ali National Park" ,"Jammu and Kashmir"),
                State_Capital("Sanjay National Park [4]" ,"Madhya Pradesh"),
                State_Capital("Sanjay Gandhi National Park" ,"Maharashtra"),
                State_Capital("Sariska Tiger Reserve" ,"Rajasthan"),
                State_Capital("Satpura National Park" ,"Madhya Pradesh"),
                State_Capital("Silent Valley National Park" ,"Kerala"),
                State_Capital("Simbalbara National Park" ,"Himachal Pradesh"),
                State_Capital("Sirohi National Park" ,"Manipur"),
                State_Capital("Simlipal National Park" ,"Odisha"),
                State_Capital("Singalila National Park" ,"West Bengal"),
                State_Capital("South Button Island National Park", "Andaman and Nicobar Islands"),
                State_Capital("Sri Venkateswara National Park" ,"Andhra Pradesh"),
                State_Capital("Sultanpur National Park" ,"Haryana"),
                State_Capital("Sundarbans National Park" ,"West Bengal"),
                State_Capital("Tadoba National Park" ,"Maharashtra"),
               State_Capital( "Valley of Flowers National Park" ,"Uttarakhand"),
                State_Capital("Valmiki National Park" ,"Bihar"),
                State_Capital("Vansda National Park" ,"Gujarat"),
                State_Capital("Van Vihar National Park" ,"Madhya Pradesh")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="National Parks"


        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Name"
        bank.text = "State/UT"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}