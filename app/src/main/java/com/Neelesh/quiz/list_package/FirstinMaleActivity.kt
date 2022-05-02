package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CityFounderAdaptor
import com.Neelesh.quiz.data_class.City_Founders4

class FirstinMaleActivity : AppCompatActivity() {


    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CityFounderAdaptor
    val listofcity = arrayListOf<City_Founders4>(
        City_Founders4("First Governor of Bengal" ,"Lord Robert Clive","1758" ,"England"),
        City_Founders4("First Governor General of Bengal" ,"Warren Hastings","1773" ,"England"),
        City_Founders4("First Governor General of India" ,"Lord William Bentinck","1828" ,"England"),
        City_Founders4("First President of Indian Republic" ,"Dr Rajendra Prasad","1950" ,"Bihar"),
        City_Founders4("First Field Marshal" ,"Gen SFJ Manekshaw","1971" ,"Punjab"),
        City_Founders4("First Indian to get Jnanpeeth Award" ,"G Shankar Kurup","1965" ,"Cochin, Kerala"),
        City_Founders4("First Indian to swim across Indian Channel" ,"Mihir Sen", "1958" ,"Bengal, British India"),
        City_Founders4("First Indian Nobel laureate" ,"Rabindranath Tagore", "1913" ,"Kolkata, Bengal"),
        City_Founders4("First Pilgrim to visit India" ,"Megasthenes","302 BC" ,"Syria"),
        City_Founders4("First Chinese Pilgrim to visit India" ,"Fa-Hien","399 AD","China"),
        City_Founders4("First Indian Pilot" ,"JRD Tata","1929", "Paris, France"),
        City_Founders4("First man to climb Mt Everest twice" ,"Nawang Gombu","1965" ,"Nepal"),
        City_Founders4("First Indian Governor General of Independent India" ,"C Rajgopalachari", "1948" ,"Thorapalli, Madras Presidency (Now Tamilnadu)"),
        City_Founders4("First Governor General of India (After Independence)", "Lord Louis Mountbatten","1947" ,"England"),
        City_Founders4("First Commander in Chief of Free India" ,"Gen KM Cariappa","1949" ,"Kodagu, British India (Now Karnataka)"),
        City_Founders4("First Indian Judge of International Court of Justice" ,"Dr Nagendra Singh","1985 ","Rajasthan"),
        City_Founders4("First Indian to receive Bharat Ratna Award" ,"C Rajgopalachari","1954" ,"Thorapalli, Madras Presidency (Now Tamilnadu)"),
        City_Founders4("","Dr S Radhakrishanan" ,"","Tiruthani, Madras Presidency (Now Tamilnadu)"),
        City_Founders4("","C. V. Raman","" ,"Trichy, Madras Presidency (Now Tamilnadu)"),
        City_Founders4("First Muslim President of Indian Republic" ,"Dr Zakir Hussain","1967" ,"Hyderabad, Telangana"),
        City_Founders4("First Indian to win Palk Strait Ocean Swimming Contest" ,"Baidyanath Nath","",""),
        City_Founders4("First President of Indian national Congress" ,"Womesh Chunder Bonnerjee","1885" ,"Calcutta, British India (Now Kolkata)"),
        City_Founders4("First Indian Scientist to get Nobel Prize" ,"CV Raman (Physics)","1930" ,"Trichy, Madras Presidency (Now Tamilnadu)"),
        City_Founders4("India’s First Chief Election Commissioner" ,"Sukumar Sen","1950" ,"Bengal"),
        City_Founders4("First Scientist of Indian Origin to get Nobel Prize in the field of Medical Science" ,"Dr Hargovind Khurana","1968" ,"Raipur, Punjab"),
        City_Founders4("First Scientist of Indian Origin to get Nobel Prize in Chemistry" ,"Venkatraman Ramakrishnan","2009" ,"Cuddalore, Tamilnadu"),
        City_Founders4("First Indian-born to get Nobel Prize in Peace" ,"Kailash Sathyarthi","2014" ,"Madhya Pradesh"),
        City_Founders4("First Sports Person to get Bharat Ratna" ,"Sachin Tendulkar","2014" ,"Maharashtra"),
        City_Founders4("First Chief Minister to die in Office" ,"CN Annadurai,","1969" ,"Tamilnadu"),
        City_Founders4("First Indian Sound Film Director" ,"Alam Ara, directed by Ardeshir Irani","1931" ,"Pune, Maharashtra"),
        City_Founders4("First Indigenously made colour film director" ,"Kisan Kanya, directed by Moti B","1937" ,"Sind, Pakistan"),
        City_Founders4("First Chief Justice of India" ,"Justice Hiralal J kania","1950" ,"Surat, Gujarat"),
        City_Founders4("First Indian to win Stalin Award" ,"Saiffudin Kichlu","1952" ,"Amritsar, Punjab"),
        City_Founders4("First Education Minister of Independent India" ,"Maulana Abul Kalam Azad","1947" ,"Saudi Arabia"),
        City_Founders4("First Prime Minister of Independent India" ,"Pandit Jawaharlal Nehru","1947" ,"Allahabad, Uttar Pradesh"),
        City_Founders4("First Home Minister of Independent India" ,"Sardar Vallahbhai Patel","1947",""),
        City_Founders4("First Vice President of Independent India" ,"Dr S Radhakrishnan","1952" ,"Tiruthani, Madras Presidency (Now Tamilnadu)"),
        City_Founders4("First Chief of Air Staff" ,"Air Marshal Sir Thomas Elmhirst","1947" ,"England"),
        City_Founders4("First Indian Air Chief of India" ,"Air Marshal S Mukherjee","1954" ,"Culcutta"),
        City_Founders4("First Chief of Army Staff" ,"Gen M Rajendra Singh","1955" ,"Katiawar (Now Gujarat)"),
        City_Founders4("First Chief of Naval Staff of India" ,"Vice Admiral RD Katari","1958" ,"Chingleput, Madras Presidency ( Now Tamilnadu)"),
        City_Founders4("First Sikh President of India" ,"Gyani Zail Singh","1982" ,"Punjab"),
        City_Founders4("First Indian to climb Mt Everest without Oxygen Cylinder" ,"Sherpa Phu Dorjee","1984" ,"Nepal"),
        City_Founders4("First Speaker of Lok Sabha" ,"GV Mavlankar","1952" ,"Vadodara, Gujarat"),
        City_Founders4("First Indian Male Recipient of Oscar Award" ,"Satyajitray","1992" ,"Calcutta, British India (Now Kolkata)"),
        City_Founders4("First Finance Minister of India" ,"RK Shanmukham Chetty","1947" ,"Coimbatore, Tamilnadu"),
        City_Founders4("First Indian to win Ramon Magasaysay Award" ,"Acharya Vinoba Bhave","1958" ,"Raigad, British India"),
        City_Founders4("First President of India to die in office" ,"Dr Zakir Hussain","1969" ,"Hyderabad, Telangana"),
        City_Founders4("First British Prime Minister to visit India" ,"Harold Mc Millan","1958" ,"England"),
        City_Founders4("First Indian Space Tourist" ,"Santosh George","2008" ,"Kerala"),
        City_Founders4("First Indian to reach South Pole" ,"Col IK Bajaj","1989" ,"Punjab"),
        City_Founders4("First American President to visit India" ,"Dwight David Eisenhower","1959" ,"USA"),
        City_Founders4("First Indian Cosmonaut" ,"Rakesh Sharma","1984" ,"Punjab"),
        City_Founders4("First Indian Prime Minister to resign from Office" ,"Morarji Desai","1979" ,"Gujarat"),
        City_Founders4("First Foreign recipient of Bharat Ratna" ,"Khan Abdul Gaffar Khan","1987" ,"Pakistan"),
        City_Founders4("First Indian recipient of Nobel Prize in Economics" ,"Dr Amartya Sen","1998" ,"Kolkata, Bengal"),
        City_Founders4("First Deputy Prime Minister of India" ,"Sardar Vallabhai Patel","1947" ,"Gujarat"),
        City_Founders4("First Indian to win World Billiards Trophy" ,"Wilson Jones","1958" ,"Maharashtra"),
        City_Founders4("First Law Minister of India" ,"BR Ambedkar","1947" ,"Madhya Pradesh")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_four_row)
        title="First in India (Male)"


        val damname: TextView =findViewById(R.id.txt4rowElt1)
        val stale : TextView = findViewById(R.id.txt4rowElt2)
        val river : TextView = findViewById(R.id.txt4rowElt3)
        val year : TextView = findViewById(R.id.txt4rowElt4)
        damname.text = "Field"
        stale.text = "Name of the Person"
        river.text="Year"
        year.text="Birth Place"

        recyclernickname=findViewById(R.id.recyclercityfounderlist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CityFounderAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager
    }
}