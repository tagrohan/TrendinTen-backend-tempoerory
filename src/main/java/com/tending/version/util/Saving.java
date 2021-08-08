package com.tending.version.util;

import com.tending.version.models.Card;

import java.util.Arrays;
import java.util.List;

public class Saving {


//   public static List<Card> getSecond() {

//      List<Card> data =
//
//              Arrays.asList(new Card("Indore, Madhya Pradesh", " Indore is a city in west-central India. Proper garbage disposal, waste segregation and conversion of waste to useful products like fuel and compost helped Indore rise above all other Indian cities and grab the top position. The largest and most populous city of Madhya Pradesh, Indore ranked 149 in 2014 in cleanliness ranking, but due to political and administrative will, it now proudly holds the â€œcleanest city of Indiaâ€� title for the fourth consecutive year!", "1", "indore.webp"),
//
//                      new Card("Surat, Gujarat", "Gujaratâ€™s cleanest city, Surat, ranks second in the list of cleanest cities in India 2020 as per the Swach Survekshan results. One of the fastest-growing cities with the help of its Municipal body has transformed completely from a garbage-strewn mess to becoming the 2nd cleanest city in India in 2020", "2", "surat.jpg"),
//                      new Card("Navi Mumbai, Maharashtra", "Navi Mumbai is the 3rd cleanest city in India and one of the cleanest cities in Maharashtra. Although it bagged the 7th position in last yearâ€™s rankings, Navi Mumbai has improved its position and claimed the 3rd position in the country.", "3", "navi.jpg"),
//                      new Card("Ambikapur, Chhattisgarh", "Ambikapur, one of the oldest cities in India, has also made it to the list of 20 cleanest cities in India 2020. The city has no dumping yards and is able to generate good income by recycling the waste. It also has put in sincere efforts in segregating at least 90% of the waste generated on a daily basis.", "4", "ambikapur.jpg"),
//                      new Card(" Mysore, Karnataka", "Karnatakaâ€™s cleanest city also ranks 5th in the list of top 20 cleanest cities in India 2020. Once ranking on top for 2 consecutive years, Mysuru still continues its pledge to stay clean and generate minimum waste. The zero-waste plant workers ensure to segregate all the household waste into different categories which is why the city has consistently stayed a recurring name in the list of cleanest cities in India.", "5", "mysore.png"),
//                      new Card("Vijayawada, Andhra Pradesh", "Vijaywada bags the fourth position in the list of cleanest cities in India, and Andhra Pradesh outclasses other states and joins the list of cleans states in India. With a population of more 10 lakh, Vijayawada has indeed invested well in converting the city into a clean one and also ranking well on the 2020 list of cleanest cities in India.", "6", "vijayawada.jpg"),
//                      new Card("Ahmedabad, Gujarat", "Although ranking 7th in the list of cleanest cities in India, it has grabbed the top spot for the category of cleanest cities with a population of over 40 lakh. Like other cities, even Ahmedabad has put in considerable efforts to create awareness about waste segregation which has been helping the city manage its waste efficiently. Such a step has lead to frequent featuring of Ahmedabad in Swach Survekshan list of cleanest cities in India", "7", "ahmedabad.jpg"),
//                      new Card("New Delhi, Delhi", "New Delhi has grabbed the 8th spot in the Swach Survekshan 2020 list of cleanest cities in India. The commendable efforts of the NDMC has aided New Delhi to climb up the list and secure the 8th spot. Although infamously known for being a polluted city, the efforts of this body has helped New Delhi find a place in this list.", "8", "delhi.jpg"),
//                      new Card("Chandrapur, Maharashtra", "Another city in Maharashtra, Chandrapur has also been named one of the cleanest cities in India 2020 list by Swach Survekshan. It has secured the 9th position.", "9", "chandrapur.jpg"),
//                      new Card("Khargone, Madhya Pradesh", "Another city from the state of Madhya Pradesh, Khargone, has caught the limelight for being one of the cleanest cities in India as announced by Swach Survekshan 2020 results. Khargone was awarded 5158.36 points and ranks 10th in the list.", "10", "khargone.jpg"));
//
//      return data;
//
//   }
//
//
//   public static List<Card> getSecond2() {
//
//      List<Card> data =
//
//              Arrays.asList(new Card("Mossad", " Mossad also ranks amongst top intelligence agencies of the world. It is the national intelligence agency of Israel. It is one of the three branches of the Israeli Intelligence Community – the other two being Shin Bet and Aman, which handles internal security and military intelligence", "1", "mossad.png"),
//
//                      new Card("Secret Intelligence Service (SIS)", "Another contender in our top intelligence agencies is the Secret Intelligence Service (SIS). The Secret Intelligence Service is the foreign intelligence agency of the UK. It is commonly known as MI6 and is one of the most popular agencies on this list. The MI6 was formed more than 100 years ago, making it one of the oldest intelligence agencies in the world", "2", "sis.jpeg"),
//                      new Card("Foreign Intelligence Service (SVR)", "Foreign Intelligence Service (SVR) holds another spot in our top 10 intelligence agencies list. The Foreign Intelligence Service is the civilian foreign intelligence agency of the Russian Federation. It is the successor to the First Chief Directorate of the KGB and works closely with the Main Intelligence Directorate, the military foreign intelligence agency of Russia.", "3", "svr.jpg"),
//                      new Card("Central Intelligence Agency (CIA)", "One of the top intelligence agencies in the world is the Central Intelligence Agency (CIA). It is the foreign intelligence agency of the US. It collects information from overseas, with minimal information collection within the country. The CIA was formed in 1947, making it one of the oldest intelligence agencies on this lis", "4", "cia.png"),
//                      new Card(" Federal Intelligence Service (BND)", "Our top 10 intelligence agencies list also includes French Federal Intelligence Service (BND). The Bundesnachrichtendienst or the Federal Intelligence Service is the foreign intelligence agency of Germany. It was formed in 1956 and directly reports to the German Chancellery.", "5", "fis.png"),
//                      new Card("Research and Analysis Wing (RAW)", "Research and Analysis Wing (RAW) is also one of the top intelligence agencies in the world. It is the foreign intelligence agency of India which probably has the least noticeable name out of all intelligence agencies in the world. However, RAW is one of the most capable in the world.", "6", "raw.png"),
//                      new Card("Directorate-General for External Security (DGSE)", "Another position among our top 10 intelligence agencies list in the world goes to Directorate-General for External Security (DGSE) which is basically operating under the French Ministry of Defence and is the French equivalent of the Central Intelligence Agency.", "7", "dgse.jpg"),
//                      new Card("Canadian Security Intelligence Service (CSIS)", "Canadian Security Intelligence Service (CSIS) also made to our top 10 intelligence agencies. Canada is one of the safest countries in the world for which most of the credit goes to the Canadian Security Intelligence Service, the main intelligence agency in Canada.", "8", "csis.png"),
//                      new Card("Australian Secret Intelligence Service (ASIS)", "Another service to make in our top intelligence agencies is the Australian Secret Intelligence Service (ASIS). It is headquartered in Canberra under the equivalent of the Central Intelligence Agency.Like many other intelligence agencies, the ASIS has been involved in a number of incidents in the past", "9", "asis.jpg"),
//                      new Card("Ministry of State Security (MSS)", "The first agency that made to our top intelligence agencies in the world is the Ministry of State Security (MSS). It was formed in 1983. It is the security and intelligence agency of China. It is headquartered in Beijing and has 17 known bureaus or divisions, including a counterintelligence division and a social research division", "10", "mss.jpg"));
//
//      return data;
//
//   }
//
//
//   public static List<Card> getSecond3() {
//
//      List<Card> data =
//
//              Arrays.asList(new Card("All India Institute of Medical Sciences (AIIMS), Delhi", " There are many AIIMS colleges in India offering a range of medical courses, with AIIMS, Delhi being one of the top-ranked institutions. The institute offers a range of academic courses such as MBBS, B.Sc. Nursing (Hons.), Bachelor of Optometry, MD/MS, M/Sc, DM, and Ph.D", "1", "aimmi.jpg"),
//
//                      new Card("Christian Medical College (CMC), Vellore", "CMC, Vellore is currently spread across 6 campuses in Tamil Nadu and Andhra Pradesh. The institute offers undergraduate courses such as MBBS, B.Sc. Nursing, Allied Health Science degree, and post-graduate courses like M.Sc., Master of Public Health, MD/MS, and MS in Bioengineering", "2", "cmi.jpg"),
//                      new Card("Banaras Hindu University (BHU), Varanasi", "BHU has a vibrant campus at Varanasi offering medical courses like MBBS (Medicine), Ayurveda, Dental Science, and Nursing. The institute is well-equipped with laboratories, a hospital, a trauma center, and IMS Gym.", "3", "bhumi.jpg"),
//                      new Card("Amrita Institute of Medical Sciences & Research, Kochi", "The medical college offers varied courses such as MBBS, Ayurveda, Nursing, MD, MS, and DM. It has a lush-green campus with a hospital, research centers, and experiential learning programs. The medical college also includes an internship program for international students to get hands-on experience working in India.", "4", "aimi.jpg"),
//                      new Card("Jawaharlal Institute of Postgraduate Medical Education & Research (JIPMER), Puducherry", "A student can study various courses in JIPMER medical college as MBBS, B.Sc. Nursing, B.Sc. (Allied Medical Sciences), MD, MS, M.Sc. and Ph.D. Another branch of JIPMER- Karaikal also offers the MBBS degree", "5", "jimi.jpg"),
//                      new Card("Kasturba Medical College (KMC), Manipal", "Kasturba Medical College offers various medical courses as MBBS, MS, MD, MD-Phd, and M.Sc. The college has a teaching hospital for hands-on clinical exposure to the students. It also collaborates with various international universities for exchange programs and research projects.", "6", "kmmi.jpg"),
//                      new Card("King George’s Medical University, Lucknow", "There are various medical courses that one can pursue in the college such as MBBS,BDS,B.Sc. Nursing, MDS, MD/MS, and PG-diploma courses. The university has diverse medical departments, hostels, and research facilities", "7", "kgmi.jpg"),
//                      new Card("Madras Medical College and Government General Hospital", "The medical college offers a variety of courses including MBBS, Bachelor of Pharmacy, Basic B.Sc. Nursing, and B.P.T. It has various departments, library, and medical laboratories.", "8", "mmmi.jpg"),
//                      new Card(" Sri Ramachandra Institute of Higher Education and Research, Chennai", "The medical college offers a diverse range of courses such as MBBS, Physiotherapy, Health science, Biomedical science, M.Sc.,and Physiotherapy. It is an eco-friendly campus with high facilities for students including health insurance", "9", "srmi.jpg"),
//                      new Card("St. John’s Medical College, Bangalore", "The medical college offers courses MBBS, nursing, MD/MS, and DM/MCh. The college has top-notch research facilities with state-of-the-art hospital, research institute, and an institute of health care management and paramedical studies.", "10", "stmc.jpg"));
//
//      return data;
//
//   }
//
//
//   public static List<Card> getSecond4() {
//
//      List<Card> data =
//
//              Arrays.asList(new Card("Medical Professionals (Doctors & Surgeons)", " Medical professionals include doctors, nurses, hospice workers, emergency medical technicians, and other trained caregivers. RAND research has analyzed retention and job satisfaction among medical professionals, examined civilian and military health care education and training, and explored the impact of the many policies that affect physicians and nurses duties and performance.", "1", "medical.jpg"),
//
//                      new Card("Chartered Accountant", "Chartered Accountant is a designation given to an accounting professional who has received certification from a statutory body that he/she is qualified to take care of the matters related accounting and taxation of a business, like file tax returns, audit financial statements and business practices", "2", "charted.jpg"),
//                      new Card("Data Scientist", "Data scientists are big data wranglers, gathering and analyzing large sets of structured and unstructured data. A data scientist’s role combines computer science, statistics, and mathematics. They analyze, process, and model data then interpret the results to create actionable plans for companies and other organizations", "3", "deta.png"),
//                      new Card("Machine Learning Experts", "In many ways, a machine learning engineer is a lot like a programmer. The primary difference is the machine learning expert needs to create programs that enable machines to self-learn and produce results without human intervention", "4", "machine.png"),
//                      new Card("Blockchain Developer", "Blockchain, being the revolutionary technology that it is, has obviously opened up a new field of development called blockchain development. This, in turn, has created numerous job opportunities for developers and tech enthusiasts. Even with such fantastic job opportunities around, people generally seem to be confused about the direction they should take to become a blockchain developer", "5", "blockchain.png"),
//                      new Card("Full Stack Software Developer", "A full stack developer is an engineer who can handle all the work of databases, servers, systems engineering, and clients. Depending on the project, what customers need may be a mobile stack, a Web stack, or a native application stack", "6", "fullstack.jpg"),
//                      new Card("Product Management", "The role of a product manager can be part of a fulfilling, exciting, and challenging career, and is ideal for people who love creating new tools and experiences for all sorts of audiences. ", "7", "product.png"),
//                      new Card("Management Consultant", "Management consultants help organizations solve problems, improve business performance, create value and maximize growth. They identify solutions for business troubles and make suggestions for changes to implement.", "8", "management.jpg"),
//                      new Card("Investment Banker", "Investment Bankers are individuals who help companies, organizations and clients manage and grow their financial assets. ... However, helping small clients increase their financial portfolio and make good profitable decisions when it comes to investing their money also comes under the purview of an Investment Banker", "9", "investment.jpg"),
//                      new Card("Marketing Manager", "A marketing manager is responsible for managing the promotion and positioning of a brand or the products and services that a company sells. Typically marketing managers are employed to attract more customers to buy from the company and to raise brand awareness through the creation of marketing campaigns", "10", "marketing.jpg"));
//
//      return data;
//
//   }
//
//
//   public static List<Card> getSecond5() {
//
//      List<Card> data =
//
//              Arrays.asList(new Card("KFG", " Medical professionals include doctors, nurses, hospice workers, emergency medical technicians, and other trained caregivers. RAND research has analyzed retention and job satisfaction among medical professionals, examined civilian and military health care education and training, and explored the impact of the many policies that affect physicians and nurses duties and performance.", "1", "medical.jpg"),
//
//                      new Card("Dhoom", "Chartered Accountant is a designation given to an accounting professional who has received certification from a statutory body that he/she is qualified to take care of the matters related accounting and taxation of a business, like file tax returns, audit financial statements and business practices", "2", "charted.jpg"),
//                      new Card("Dhoom2", "Data scientists are big data wranglers, gathering and analyzing large sets of structured and unstructured data. A data scientist’s role combines computer science, statistics, and mathematics. They analyze, process, and model data then interpret the results to create actionable plans for companies and other organizations", "3", "deta.png"),
//                      new Card("d3", "In many ways, a machine learning engineer is a lot like a programmer. The primary difference is the machine learning expert needs to create programs that enable machines to self-learn and produce results without human intervention", "4", "machine.png"),
//                      new Card("I movie", "Blockchain, being the revolutionary technology that it is, has obviously opened up a new field of development called blockchain development. This, in turn, has created numerous job opportunities for developers and tech enthusiasts. Even with such fantastic job opportunities around, people generally seem to be confused about the direction they should take to become a blockchain developer", "5", "blockchain.png"),
//                      new Card("Cars", "A full stack developer is an engineer who can handle all the work of databases, servers, systems engineering, and clients. Depending on the project, what customers need may be a mobile stack, a Web stack, or a native application stack", "6", "fullstack.jpg"),
//                      new Card("xyz", "The role of a product manager can be part of a fulfilling, exciting, and challenging career, and is ideal for people who love creating new tools and experiences for all sorts of audiences. ", "7", "product.png"),
//                      new Card("new movie", "Management consultants help organizations solve problems, improve business performance, create value and maximize growth. They identify solutions for business troubles and make suggestions for changes to implement.", "8", "management.jpg"),
//                      new Card("mov", "Investment Bankers are individuals who help companies, organizations and clients manage and grow their financial assets. ... However, helping small clients increase their financial portfolio and make good profitable decisions when it comes to investing their money also comes under the purview of an Investment Banker", "9", "investment.jpg"),
//                      new Card("Strangers thing", "A marketing manager is responsible for managing the promotion and positioning of a brand or the products and services that a company sells. Typically marketing managers are employed to attract more customers to buy from the company and to raise brand awareness through the creation of marketing campaigns", "10", "marketing.jpg"));
//
//      return data;
//
//   }
}