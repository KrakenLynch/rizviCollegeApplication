package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class About_us extends AppCompatActivity {

    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Button = new ArrayList<>();
        //About college
        Button.add(new button("About College", "", "The Rizvi Education Society was established by Dr. AKHTAR HASAN RIZVI in the year 1982, who set his heart on the realization of a dream \"the establishment of a mini university\", catering to a variety of educational interests and aspirations. The Rizvi College of Arts, Science & Commerce was started in the academic year 1985-86. This was just the beginning of a line of successful ventures that were to follow. The amazing speed with which one professional institute followed another was awe-inspiring. Today, the Rizvi Educational Empire has expanded to unimaginable dimensions. As of now, we have twenty two institutes in all, not only in Mumbai but in Jaunpur, Allahabad (Kaushambi, Karari) as well.\n" +
                "\n" +
                "Senior College is affiliated to the University of Mumbai for teaching courses leading to B.A., B.Sc., B.Com., B.M.M., B.M.S., B.B.I., B.A.F., B.Sc. (Computer Science), B.Sc. (I.T.), and M.Com. Degrees.\n" +
                "\n" +
                "Junior College is recognised by the Education Department, Govt. of Maharashtra and H.S.C. Board to conduct classes of F.Y.J.C. and S.Y.J.C along with vocational courses in Electronics, Computer Science and Information Technology.\n" +
                "\n" +
                "College has started with M.Sc. in Chemistry (By Research), Ph.D. in Zoology and Ph.D. in Botany, whose permission is given by Univeristy of Mumbai.\n" +
                "\n" +
                "Because of the college's comprehensive offerings, its excellent programs, its uniquely talented faculty, and its support services, Rizvi College enjoys one of the highest numbers of students in Bandra (West), Mumbai area.\n" +
                "\n" +
                "Rizvi College provides extensive collegiate and co-curricular experiences for students, including such opportunities as student men's intercollegiate cricket team; performance groups; a Degree Program; and a host of activities in which students learn leadership skills, expand their academic horizons and celebrate cultural diversity.\n" +
                "\n" +
                "As you move through the college website pages, you will also find information about the college's the academic, administrative& extra curricular activities of the college for e.g. Examination, Unfair Means Inquiry, Attendance, Cultural, Career & Counseling Cell, Library, Women Development Cell, Grievance Redressal Cell, Discipline, etc. Other services as Gymkhana, NSS, NCC, financial aid, health services just to name a few.", R.drawable.rizvi_college_campus));

        // vision and mission
        Button.add(new button("Vision and Mission", "", "VISION\n" +
                "The upliftment of Muslim Minority students through quality education. \n MISSION\n" +
                "Dr. A. H. Rizvi has succeeded in fulfilling his deep desire to help the less fortunate ones who are not able to pursue higher education, especially those belonging to the “Muslim Minority Community”. Our mission statement being “Education for all”, we admit students with low percentage and nurture them to improve in intelligence and wit, by improving their Performance and honing their skills in all respect for an overall development.", R.drawable.vm));

        //Presidents
        Button.add(new button("President's message", "Dr. A. H. Rizvi", "I welcome and appreciate the efforts of the Principal, Staff and & Students of Rizvi College of Arts, Science & Commerce in providing an environment to achieve national and international recognition. Our college is student-focused and learner-centered institution in the Queen of suburbs, Bandra (West), Mumbai.\n" +
                "\n" +
                "Our mission is to educate students who exhibit a high level of competence in their area of study, sports, cultural and demonstrate service to the community. The College values student learning, critical thinking, oral and written communication skills, and an understanding of a globally-oriented world.\n" +
                "\n" +
                "Through intellectual, social, physical, and spiritual development, Rizvi College seeks to provide students with skills and strengths they will need in their roles as citizens, friends, parents, community leaders, employers, employees, teachers, and caring individuals.\n" +
                "\n" +
                "Our education society is committed to providing you with an outstanding education that is current, relevant, and meaningful in today’s dynamic and rapidly changing global marketplace.\n" +
                "\n" +
                "I wish you success as you work towards your future.", R.drawable.ahrizvi));

        //Director
        Button.add(new button("Director,s message", "Adv. Rubina Akhtar Hasan Rizvi", "Adhering strictly to our motto, ‘Equalise, Humanise and spiritualize’ and following the words of guidance of our chief patron Dr. A. H. Rizvi, we strive to create citizens who are able to face challenges of the contemporary world. We impart education that is value and skill based to enable students to accomplish their dreams and aspirations. Our stellar accomplishments expand the frontiers of knowledge. In this era of Globalization of education the obvious focus is on the quality of education. As an educational institution we continuously strive for sustenance and enhancement of quality in every field of its activity.\n" +
                "\n" +
                "Rizvi College of Arts, Science & Commerce stands committed to the practice of academic freedom and encourages cultural diversity as it continues to attract students and faculty. We aim at the upliftment of urban and rural youth, driven by relentless quest to excel. The college consistently and passionately is on the move to acquire synergetic outcome among a blend of knowledge, skill, creativity and competence created on the bedrock of secularism and ethical values.\n" +
                "\n" +
                "We encourage independent thinking that helps students in developing holistic perception, strong domain knowledge, contemporary skill sets and positive attitude. The management provides the best in terms of knowledge, infrastructure & environment. Our students have been achieving tremendous results in academics, sports and extra-curricular activities and we aspire to achieve many milestones in future.", R.drawable.rubina));

        //Secretory
        Button.add(new button("Secretary", "Mr. Abis Rizvi", "Success comes to those who work hard and stays with those, who don't rest on the laurels of the past. Rizvi Education Society endures to create a milestone in the life of our students that marks their growth, unfolds their imagination and gives meaning to their thoughts and aspirations.", R.drawable.secretary));
        //treasure
        Button.add(new button("Treasurer", " Mr. Sayed Saqib Akhtar Hasan Rizvi", "", R.drawable.treasurer));
        //Principle
        Button.add(new button("Principle's Message", "Dr. Paul R. P.", "Rizvi Education Society’s Rizvi College of Arts, Science & Commerce was established in the year 1986 with a motto \"Humanize, Equalize, Spiritualize\". Our commitment is to provide a safe and intellectually challenging environment that will empower students to become innovative thinkers, creative problem solvers and inspired learners prepared to thrive in the twenty-first century.\n" +
                "\n" +
                "We believe that our purpose is to honour, value and support all the students in our care. We have committed to adding value to each child through the provision of programmes that are designed to support, nurture and enrich their lives. Rizvi College strives to open new doors for each child by acknowledging and encouraging personal interests, talents and needs. High standards and expectations for each student in regard to academic performance, co-curricular participation and responsible citizenship are the foundation of our College. It is with great pride that we hold these high standards and ask each of our students to commit to maintaining the extraordinary record of achievement and contribution that has been the legacy of Rizvi College students.\n" +
                "\n" +
                "It is the contribution of our students to our College community that makes Rizvi College of Arts, Science & Commerce an exceptional learning community. Full participation in academic and co-curricular programs and a willingness to act responsibly as an individual within our educational environment are the factors that enable all to have a successful and enjoyable year.\n" +
                "\n" +
                "Dear students, our missionary zeal must be in unison with our vision. Our actions should complement the Institutional objectives and move alongside the national goals. Individuals and institutions are responsible for building a welfare state.\n" +
                "\n" +
                "If our efforts help in the progress of each class of society as individuals and as an institution we will be contributing to the overall growth and development of the diverse population of this country.\n" +
                "\n" +
                "If I can be of any assistance, please do not hesitate to contact at my Office. I can also be reached at principal.asc@rizvicollege.edu.in.", R.drawable.paul));
        //Press
        Button.add(new button("Press Release", "", "", R.drawable.press));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.about_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
