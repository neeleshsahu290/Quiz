package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class ScientificinstrumentsActivity : AppCompatActivity() {


    lateinit var recyclerrivercity : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofrivercity = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Altimeter" ,"An instrument used in aircrafts for measuring altitudes" ,"French physicist Louis Paul Cailletet"),
        Country_Capital_Currency("Ammeter" ,"Measures electric current", "Friedrich Drexler"),
        Country_Capital_Currency("Anemometer" ,"Used to measure the speed, direction and pressure of the wind" ,"Leon Battista Alberti") ,
        Country_Capital_Currency("Audiometer" ,"Measures intensity of sound" ,"Georg von Békésy (1899-1972; winner of the Nobel Prize), a Hungarian-American physicist."),
        Country_Capital_Currency("Barograph" ,"Continuous recording of atmospheric pressure" ,"Frenchman Lucien Vidi"),
        Country_Capital_Currency("Barometer" ,"Measures atmospheric pressure and conditions." ,"Evangelista Torricelli"),
        Country_Capital_Currency("Binoculars" ,"An optical instrument used for magnified view of distant objects." ,"J. P. Lemiere"),
        Country_Capital_Currency("Bolometer" ,"Measures infra-red (Heat) radiation" ,"Samuel Pierpont Langley"),
        Country_Capital_Currency("Callipers" ,"Measures diameters of thin cylinder/wire."," Pierre Vernier"),
        Country_Capital_Currency("Calorimeter" ,"Measures quantity of heat" ,"Antoine Lavoisier and Pierre-Simon"),
        Country_Capital_Currency("Carburettor" ,"Used for charging air with petrol vapours in an internal combustion engine." ,"The first carburetor was invented by Samuel Morey in 1826. Later, Enrico Bernardi developed another carburetor at the University of Padua in 1882"),
        Country_Capital_Currency("Cardiogram(ECG)" ,"Traces movements of the heart , recorded on a Cardiograph" ,"Willem Einthoven"),
        Country_Capital_Currency("Cathetometer" ,"Determines heights and levels" ,"French physicists P. Dulong and A. Petit(1816)"),
        Country_Capital_Currency("Chronometer" ,"Determines longitude of a vessel at sea." ,"John Harrison") ,
        Country_Capital_Currency("Cinematograph" ,"Used for projecting pictures on the screen." ,"Auguste Lumière" ),
        Country_Capital_Currency("Colorimeter" ,"Compares intensity of colours" ,"John T. Stock"),
        Country_Capital_Currency("Commutator" ,"Used in generators to reverse the direction of electric current." ,"British scientist William Sturgeon in 1832"),
        Country_Capital_Currency("Crescograph" ,"Used for measuring growth in plants." ,"Jagadish Chandra Bose"),
        Country_Capital_Currency("Cryometer" ,"Measurement of low temperature.",""),
        Country_Capital_Currency("Cyclotron" ,"Used for accelerating charged particles in microwave oscillator" ,"Ernest Lawrence" ),
        Country_Capital_Currency("Dilatometer" ,"Measures change in volume of substances" ,"Abbe and Fizeau in the second half of 19th century"),
        Country_Capital_Currency("Dynamo" ,"Coverts mechanical energy into electrical energy" ,"Michael Faraday" ),
        Country_Capital_Currency("Electrometer" ,"Measures very small but potential difference in electric currents" ,"William Snow Harris"),
        Country_Capital_Currency("Electrometer" ,"Used for measuring electrical potential difference.",""),
        Country_Capital_Currency("Electroscope" ,"Detects presence of an electric Charge" ,"William Gilbert"),
        Country_Capital_Currency("Electron microscope" ,"Used to obtain a magnifying view of very small objects (20,000 times)." ,"Max Knoll and Ernst Ruska"),
        Country_Capital_Currency("Endoscope" ,"To examine internal parts of the body" ,"Bozzini"),
        Country_Capital_Currency("Fathometer" ,"Measures depth of the ocean" ,"Herbert Grove Dorsey (April 24, 1876 – 1961)"),
        Country_Capital_Currency("Fluxmeter" ,"Measures magnetic flux" ,"Muller Martin"),
        Country_Capital_Currency("Galvanometer" ,"Measures electric current" ,"Johann Schweigger"),
        Country_Capital_Currency("Gramophone" ,"Used to reproducing recorded sound." ,"French inventor Édouard-Léon Scott de Martinville"),
        Country_Capital_Currency("Hydrometer" ,"Measures the relative density of liquids" ,"William Nicholson"),
        Country_Capital_Currency("Hydrophone" ,"Measure sound under water" ,"Reginald Fessenden"),
        Country_Capital_Currency("Hygrometer" ,"Used to measure the moisture content or the humidity of air or any gas." ,"Horace Bénédict de Saussure"),
        Country_Capital_Currency("Hygroscope" ,"Shows the changes in atmospheric humidity" ,"Robert Hooke"),
        Country_Capital_Currency("Hypsometer" ,"Determines boiling point of liquids." ,"Wayne R Norman"),
        Country_Capital_Currency("Lactometer" ,"Measures the relative density of milk. Mr. Dicas Machmeter Determines the speed of an aircraft relative to the speed of sound" ,"Angst Walter"),
        Country_Capital_Currency("Magnetometer" ,"Compares magnetic movement and fields" ,"Otton von Guerick"),
        Country_Capital_Currency("Manometer" ,"Used to measure atmospheric pressure",""),
        Country_Capital_Currency("Micrometer" ,"Coverts sound waves into electrical vibration" ,"William Gascoigne"),
        Country_Capital_Currency("Microphone" ,"Converts sound waves into electrical signals." ,"Emile Berliner"),
        Country_Capital_Currency("Microscope" ,"Used to obtain a magnified view of small objects" ,"Zacharias Janssen"),
        Country_Capital_Currency("Nephetometer" ,"Measures the scattering of light by particles suspended in a liquid" ,"Theodore William Richards"),
        Country_Capital_Currency("Odometer" ,"An instrument attached to the wheel of a vehicle, to measure the distance travelled." ,"Benjamin Franklin"),
        Country_Capital_Currency("Ohmmeter" ,"Measures electrical resistance of objects" ,"Osvold Robert Harold"),
        Country_Capital_Currency("Ondometer" ,"Measures the frequency of electromagnetic waves(radio waves)",""),
        Country_Capital_Currency("Optometer" ,"Used for testing the refractive power of the eye." ,"Dr Jules Badal"),
        Country_Capital_Currency("Otoscope", "Used for visual examination of the eardrum." ,"E. Seigle"),
        Country_Capital_Currency("Periscope", "Used to view objects above sea level (Used in submarines)." ,"Hippolyte Marié-Davy"),
        Country_Capital_Currency("Phonograph" ,"Used for reproducing sound." ,"Thomas Edison"),
        Country_Capital_Currency("Photometer" ,"Compares the luminous intensity of the two sources of light" ,"Dmitry Lachinov"),
        Country_Capital_Currency("Polygraph" ,"It simultaneously records changed in physiological processes such as heartbeat, blood pressure & the respiration (used as lie detector)" ,"William Moulton Marston"),
        Country_Capital_Currency("Pyrheliometer" ,"Used for measuring Solar radiation." ,"C. G. ABBOTT"),
        Country_Capital_Currency("Pyrometer" ,"Measures very high temperature." ,"Josiah Wedgwood"),
        Country_Capital_Currency("Quadrant" ,"Measures altitudes and angles in navigation and astronomy" ,"John Hadley"),
        Country_Capital_Currency("Radar" ,"Radio, Detection and Ranging." ,"Heinrich Hertz"),
        Country_Capital_Currency("Rain Gauge" ,"Measures Rainfall." ,"King Sejong the Great"),
        Country_Capital_Currency("Refractometer" ,"Measures salinity of solutions" ,"Ernst Abbe"),
        Country_Capital_Currency("Refractometer" ,"Measures a Refractive Index of a substance." ,"Carl Zeiss"),
        Country_Capital_Currency("Sextant" ,"Used by navigators to find the latitude of place by measuring the elevation above the horizon of the sun or another star; also used to measure the height of very distant objects" ,"John Campbell"),
        Country_Capital_Currency("Sextant" ,"Used for measuring angular distance between two objects.",""),
        Country_Capital_Currency("Siesmograph" ,"Used for recording the intensity and origin of earthquakes shocks." ,"John Milne"),
        Country_Capital_Currency("Spectroscope", "Used for Spectrum analysis.", "Robert Wilhelm Bunsen"),
        Country_Capital_Currency("Speedometer" ,"An instrument used for measuring speed of the vehicle." ,"Croatian Josip Belušić in 1888"),
        Country_Capital_Currency("Spherometer" ,"Measures curvature of spherical objects." ,"Robert-Aglaé Cauchoix"),
        Country_Capital_Currency("Sphygmomanometer", "Measures blood pressure." ,"Samuel Siegfried Karl Ritter von Basch in 1881"),
        Country_Capital_Currency("Stethoscope" ,"Used for hearing and analysing the sound of Heart." ,"René Laennec"),
        Country_Capital_Currency("Tachometer", "To determine speed, especially the rotational speed of a shaft(rpm)" ,"James W. Allen "),
        Country_Capital_Currency("Tangent galvanometer" ,"Measure the amount of direct current(DC)" ,"André-Marie Ampère"),
        Country_Capital_Currency("Telemeter" ,"Records physical happenings at a distant place(space)" ,"C. Michalke"),
        Country_Capital_Currency("Telescope" ,"Used for magnified view of distant objects." ,"Hans Lippershey"),
        Country_Capital_Currency("Thermometer" ,"Measures Temperature" ,"Galileo Galilei"),
        Country_Capital_Currency("Thermostat" ,"Automatically regulates temperatures at a constant point." ,"Warren S. Johnson"),
        Country_Capital_Currency("Tonometer", "Measures the pitch of a sound" ,"John Austin"),
        Country_Capital_Currency("Transformer" ,"An apparatus used for converting high voltage to low and vice-versa without change in its frequency." ,"Ottó Bláthy"),
        Country_Capital_Currency("Transponder" ,"To receive a signal and transmit a reply immediately in satellites." ,"Charles M Redman"),
        Country_Capital_Currency("Venturimeter", "Measures the rate of flow of liquids" ,"Clemens Herschel"),
        Country_Capital_Currency("Vernier" ,"Measures Small sub-division of scale." ,"Pierre Vernier"),
        Country_Capital_Currency("Viscometer" ,"Measures Viscosity of liquid." ,"Edward H Zeitfuchs"),
        Country_Capital_Currency("Voltmeter", "Used to measure electric potential difference between two points"," Andrew Kay"),
        Country_Capital_Currency("Wattmeter", "To measure electric power" ,"Ottó Bláthy" ),
        Country_Capital_Currency("Wavemeter" ,"To measure the wavelength of a radiowave(high frequency waves)", "Paul D Zottu")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="SCIENTIFIC INSTRUMENTS AND THEIR USES"

        val city : TextView = findViewById(R.id.txt3rowElt1)
        val river : TextView = findViewById(R.id.txt3rowElt2)
        val state : TextView = findViewById(R.id.txt3rowElt3)
        city.text = "Scientific Insruments"
        river.text = "Uses"
        state.text ="Inventors"

        recyclerrivercity =findViewById(R.id.recyclercountrycurrencylist)
        recyclerrivercity.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofrivercity)
        recyclerrivercity.adapter = recyclerAdapter
        recyclerrivercity.layoutManager =  layoutManager
    }
}