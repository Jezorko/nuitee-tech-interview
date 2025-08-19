**Introduction**

Welcome to the Backend Engineering technical assessment. This assessment is designed to evaluate your skills in consuming external APIs, designing efficient storage solutions, and creating a robust, extendable backend service. You will work with the Cupid API to fetch property details, reviews, and translations, design a data storage system, and expose enhanced public APIs based on the fetched data. Additionally, you are encouraged to innovate by introducing extra endpoints, AI-powered features, or third-party integrations.

---

**Assessment Overview**  
You are required to:

1. **Consume Data:** Use the provided property ID list to fetch hotel properties using the [Cupid API \- Get Property by Hotel ID](https://docs.cupid.travel/reference/get_property-hotelid).  
2. **Store Data:** Store fetched properties, along with reviews and translations in **French** and **Spanish**, in a suitable database schema.  
3. **Expose a Public API:** Design a well-documented public API to expose the stored data, including endpoints for fetching hotels, reviews, translations, and more .  
   **Question :** Would you like me to host the API in a publicly accessible environment, or is setting it up locally sufficient?  
   Based on this, I’ve planned to make 4 API calls using the provided hotel IDs (for property details, reviews, and translations in French and Spanish). And could you please clarify if I need to store data for all the hotel IDs or picking a few is fine.  
   Could you please clarify what **“and more”** refers to here.  
4. **Extend the System:** Add features such as additional endpoints, data processing, or AI-powered functionalities to improve the API’s usefulness. **(Optional)**  
   **Question :** I’d like to better understand the expectations here. Are these optional enhancements or required elements? If I need to work on these features I will require scope clarity as it will take a lot of time to work.  
5. **Testing and Maintenance:** Provide unit and integration tests, design a strategy for keeping the data up-to-date **(Optional)**, and outline your database schema.   
   **Question : "Design a strategy for keeping the data up to date"** : I noticed the Cupid portal provides a webhook API, which would require me to publicly expose my own API. Could you clarify whether you expect an actual implementation of this or a high-level design?

---

**Requirements**

**Part 1: Data Consumption**

**Objective:** Fetch property details, reviews, and translations for **French** and **Spanish** using the [Cupid API](https://docs.cupid.travel/reference/get_property-hotelid).

1. **API Integration:**  
- Fetch hotel properties using a list of given property IDs.  
- Fetch related reviews and language translations (French and Spanish).  
- Handle errors, retries, and API limitations.  
2. **Tools and Frameworks:**  
-  Any language or framework you are comfortable with between the following 3 (Go, Python, Java, Kotlin).

Here is a list of property ids that you can use

1641879, 317597, 1202743, 1037179, 1154868, 1270324, 1305326, 1617655, 1975211, 2017823, 1503950, 1033299, 378772, 1563003, 1085875, 828917, 830417, 838887, 1702062, 1144294, 1738870, 898052, 906450, 906467, 2241195, 1244595, 1277032, 956026, 957111, 152896, 896868, 982911, 986491, 986622, 988544, 989315, 989544, 990223, 990341, 990370, 990490, 990609, 990629, 1259611, 991819, 992027, 992851, 993851, 994085, 994333, 994495, 994903, 995227, 995787, 996977, 1186578, 999444, 1000017, 1000051, 1198750, 1001100, 1001296, 1001402, 1002200, 1003142, 1004288, 1006404, 1006602, 1006810, 1006887, 1007101, 1007269, 1007466, 1011203, 1011644, 1011945, 1012047, 1012140, 1012944, 1023527, 1013529, 1013584, 1014383, 1015094, 1016591, 1016611, 1017019, 1017039, 1017044, 1018030, 1018130, 1018251, 1018402, 1018946, 1019473, 1020332, 1020335, 1020386, 1021856, 1022380

---

**Bonus Points**

1. **Performance Optimization:**  
- Use caching for frequent API queries.  
- Optimize database queries and API response times.  
2. **Code Quality:**  
- Follow best practices such as clean code principles, REST standards, and SOLID principles.  
3. **Infrastructure as Code:**  
- Provide Dockerfiles, Kubernetes configurations, or cloud deployment scripts.  
  **Question :** Will a cloud instance be provided for deployment? If not, I would prefer to limit the scope to providing Dockerfiles only.  
4. **Advanced Features:**  
- Use AI-powered search and review summaries.  
- Implement logging, monitoring, and alerting.  
  **Question : While I can implement logging, I’d prefer to keep dashboards and alerting mechanisms out of scope for now unless specifically required.**

---

**Submission Instructions**  
Please submit:

	•	**Codebase:** A GitHub repository link with clear instructions for running the project.

	•	**Database Schema:** A well-documented schema design (ER diagram or equivalent).

	•	**API Documentation:** Swagger or API documentation link.

	•	**Testing Results:** Details of tests and their results.

	•	**Data Sync Strategy:** Documentation explaining the approach.

---

**Evaluation Criteria**

1. **Correctness:** Does the solution work as expected?  
2. **API Design:** Is the API well-designed, documented, and extendable?  
3. **Database Design:** Is the schema efficient, normalized, and scalable?  
4. **Testing & Coverage:** Are the tests comprehensive and meaningful?  
5. **Code Quality:** Is the code clean, maintainable, and well-organized?  
6. **Innovation:** Did the candidate implement any innovative features or enhancements

**Good luck\!** Feel free to reach out if you have any questions or need further clarification.