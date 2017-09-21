package yali.hkonnect.net.yalilearns;


import java.io.Serializable;

public class LessonObject implements Serializable {
    private String name;
    private String description;
    private String video;
    private String picture;
    private String duration;

    public LessonObject(String name, String description, String video, String picture, String duration) {
        this.name = name;
        this.description = description;
        this.video = video;
        this.picture = picture;
        this.duration = duration;
    }

    public LessonObject() {
    }

    public String getName() {
        return name;
    }

    // Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public LessonObject getLesson(String title, Integer position) {
        switch (title) {
            // Leadership
            case "Responsible Leadership on Transparency and Good Governance":
                switch (position) {
                    case 1:
                        return new LessonObject("Why Transparency and Good Governance Matter", "What does it mean when we say “transparency and good governance”?\n\nThis lesson defines both concepts, the benefits when they are present, and the harmful effects on people and institutions when they are absent.\n\nIt also takes a look at international norms and treaties that seek to ensure that governments and businesses are held to common standards of conduct.", "p22-bpPs6dM", "img_leadership_1", "3:13");
                    case 2:
                        return new LessonObject("Institutionalizing Transparency and Good Governance", "This lesson discusses the different types of institutional frameworks or “checks and balances” and how each is critical to good governance.\n\nThe lesson covers the five institutional frameworks that are necessary to achieve good governance: a commitment to transparency, effective governmental structures and oversight, anti-corruption laws, whistleblower protections, and freedom of the press.", "tfrbYCF6_OA", "img_leadership_2", "3:13");
                    case 3:
                        return new LessonObject("It Starts With You - Promoting Transparency and Good Governance", "This lesson offers ways that citizens can promote transparency and good governance by engaging with their leaders, utilizing tools such as the internet and social media, increasing corporate social responsibility, finding ways to educate others and promote individual responsibility, and celebrating those “heroes” who are working to end corrupt practices.", "GQ3nK8z7VsI", "img_leadership_3", "3:13");
                }
            case "Strategies for Personal Growth and Development":
                switch (position) {
                    case 1:
                        return new LessonObject("Developing a Personal Code of Ethics", "Learn how to build a personal code of ethics that will help you as a leader and boost confidence in your decision making.", "", "", "4:32");
                    case 2:
                        return new LessonObject("The Art of Public Speaking", "Whether it’s speaking up in a meeting or giving a presentation to a boss or clients, public speaking is essential to success.\n\nLearn how to write and deliver a speech clearly using concise, persuasive language.", "", "", "3:53");
                    case 3:
                        return new LessonObject("Networking to Get Ahead", "Knowing how to network effectively is essential to growing both personally and professionally.\n\nThis lesson reviews how to create a positive, useful network and the work required to maintain it.", "", "", "4:23");
                }
            case "Workforce Collaboration and Development":
                switch (position) {
                    case 1:
                        return new LessonObject("Setting and Achieving Goals", "As a leader, you have a vision for your organization that must be completed with both short term and long term goals.\n\nThis lesson looks at the importance of setting clear goals, why it is key to involve your team members, and the basic steps for proper goal-setting.", "", "", "5:00");
                    case 2:
                        return new LessonObject("Designing and Delivering Training", "Knowing the basics of how to design and deliver training is necessary to providing a positive learning experience that will benefit the individual and any organization.", "", "", "5:11");
                    case 3:
                        return new LessonObject("Improving Your Network, Your Team and Your Organizational Structure", "", "", "Recruiting and developing the right team is critical to success.\n\nA diverse set of individuals who can challenge and support your management decisions are key to succeeding in a global market.", "4:52");
                }
            case "Management Strategies for People and Resources":
                switch (position) {
                    case 1:
                        return new LessonObject("Leading People and Change", "Leaders not only act as the head of corporations and governments.\n\nThey also must address and solve a multitude of problems every day.", "", "", "3:55");
                    case 2:
                        return new LessonObject("Creating and Managing A Team", "This lesson guides leaders in selecting, training, mentoring and managing a team that will perform optimally.\n\nIt reviews what creates a motivated and productive work environment.", "", "", "5:02");
                    case 3:
                        return new LessonObject("Managing Situations", "Management is a key component of leadership and is what brings about change.\n\nLearn about the four essential skills that all managers must master to be successful.", "", "", "4:20");
                }

                // Focus on
            case "Understanding Renewable Energy":
                switch (position) {
                    case 1:
                        return new LessonObject("The Energy of Tomorrow", "The world has seen rapid growth in the development of renewable energy in recent years, particularly wind and solar.\n\nThese renewable resources are rapidly becoming the energy of the 21st century.\n\nIn this lesson, we will take a brief look at the current state of electric power generation and explore the trends that are pointing us toward a very different future, relying much more heavily on clean, renewable energy.", "", "", "7:43");
                    case 2:
                        return new LessonObject("The Power System", "If wind and solar are now cost-competitive with traditional energy sources in many parts of the world, then why haven’t we already converted all of our energy systems to run on renewable energy? In this lesson, we will learn how power systems operate, how power companies and their system operators can use renewable energy sources to meet the needs of their customers, and what countries can do to guarantee that their renewable energy–based power supplies are available when and where they need them.", "", "", "9:35");
                    case 3:
                        return new LessonObject("Energy and You", "Utility companies play a large role in defining the renewable energy field, but you as a consumer also play a large role in both energy production and consumption.\n\nWhat are ways that you can reduce your energy usage every day and what impact will it make on the world? In this lesson, we will offer ways that individuals can help their communities and countries move to renewable energy sources and also look at specific measures that individuals can take to reduce their energy demand and be more efficient consumers.", "", "", "7:02");
                }
            case "Understanding Human Rights":
                switch (position) {
                    case 1:
                        return new LessonObject("The Legal and Moral Obligations to Protect Human Rights", "Human rights are the basic rights and freedoms to which all humans are entitled.\n\nHow we define and defend the rights of all humans is based on treaties and customary law that nearly every nation on the planet has adopted.\n\nIn this lesson, we will look at the evolution of human rights law and treaties that outline the minimum legal standard of treatment that must be afforded to everyone.", "", "", "12:10");
                    case 2:
                        return new LessonObject("Protecting Human Rights to Benefit All", "Often the most vulnerable in a population are its most marginalized.\n\nMarginalizing people based on race, gender, sexual orientation, religious beliefs, physical disability, or economic or social status means to relegate them, their views and their needs to the fringes of society.\n\nIn this lesson, we look at what it means to provide equal protection and an equitable playing field for all members of society, and why human rights protections that benefit everyone are critical to a peaceful and just world.", "", "", "7:50");
                    case 3:
                        return new LessonObject("Ensuring the Human Rights of All", "Advocating for human rights requires educating oneself on the principles of human rights and how the principles are being applied within your community.\n\nIt starts with thinking not only about your own rights, but also about the rights of the most vulnerable and marginalized.\n\nThis lesson looks at ways individuals and groups can support the cause of human rights and stand for all.", "", "", "7:47");
                }
            case "Understanding the Rights of Women and Girls":
                switch (position) {
                    case 1:
                        return new LessonObject("Supporting a Girl’s Right to Learn", "When women and girls have equal access to education, societies prosper.\n\nThis lesson examines the many benefits to individuals, families, and communities when they prioritize girls’ education, how gender discrimination and outdated social constructs are barriers to educational opportunity, and the necessary partnerships required to achieve gender equality in education.", "", "", "6:55");
                    case 2:
                        return new LessonObject("Paving the Way for Women Entrepreneurs", "This lesson features the pivotal role women play in a nation’s economy, how gender bias creates obstacles for women starting new businesses, and strategies and tools to address certain types of gender discrimination including negative gender stereotyping that can keep women from succeeding in business and the workplace.", "", "", "9:02");
                    case 3:
                        return new LessonObject("Ending Violence Against Women & Girls", "Gender-based violence is a global epidemic.\n\nIt crosses every social and economic class, ethnicity, race, religion, and education level, and transcends international borders.\n\nThis lesson covers the facts and consequences surrounding violence against women and girls, the responsibility that men have in preventing gender-based violence, and the necessary and practical approaches to ending it.", "", "", "7:23");
                }
            case "Understanding Elections and Civic Responsibility":
                switch (position) {
                    case 1:
                        return new LessonObject("Getting the Most From Your Vote", "In this lesson, presenter Thierry Uwamahoro reviews voter rights and responsibilities, the benefits of active political engagement by citizens, how to make informed voting choices, and the necessity to maintain personal integrity as a voter.", "", "", "6:55");
                    case 2:
                        return new LessonObject("Grassroots Organizing For Civic Engagement", "Veteran campaign consultant Buffy Wicks provides an overview of how to lead and enable citizens to create change in their communities, offering guidelines and best practices for developing and running a grassroots campaign.", "", "", "6:52");
                    case 3:
                        return new LessonObject("Engaging with Candidates and Elected Officials", "This lesson focuses on how to engage with a candidate or elected official, including detailing the recommended steps to take to prepare for a meeting as well as best practices for conducting yourself and your business during the meeting in order to get results.", "", "", "6:10");
                }
            case "Understanding Climate Change":
                switch (position) {
                    case 1:
                        return new LessonObject("The Basics: The Science of Climate Change", "A primer on the basic science of climate change, examining the differences between climate and weather and how scientists determine that the planet is getting hotter.\n\nThis lesson also takes a detailed look at greenhouse gases – what they are, the role of human behavior in releasing them, and their effect on climate change.", "", "", "5:18");
                    case 2:
                        return new LessonObject("The Impacts: How Climate Change Affects Africa", "This lesson takes a look at the very real effects of climate change on human and animal populations and migration, rainfall-dependent agriculture and the serious problems of drought and changes in typical precipitation patterns, and the intensification of illnesses such as mosquito borne diseases and respiratory and cardiovascular sickness.", "", "", "4:35");
                    case 3:
                        return new LessonObject("The Solutions: Taking Action to Reduce Climate Change", "Learn about technologies – big and small – that are being used to reduce the effects of climate change, including solar, wind, and hydroelectric power, as well as the importance of preserving and maintaining forests and what you can do to help stop climate change.", "", "", "6:20");
                }

                // Civic
            case "Creating and Maintaining Social Enterprises":
                switch (position) {
                    case 1:
                        return new LessonObject("Creating Your NGO’s Strategic Plan", "A strategic plan provides a road map for your organization’s future by ensuring that you have a clear mission, vision and goals.\n\nLearn about how you can create and implement an effective strategic plan.", "", "", "4:10");
                    case 2:
                        return new LessonObject("Creating Partnerships", "Nongovernmental organizations cannot achieve their vision alone.\n\nThey must partner with other NGOs, the private sector and government to reach their goals.\n\nLearn how partnerships facilitate relationship building, coordination and collaborations on projects.", "", "", "5:16");
                    case 3:
                        return new LessonObject("Managing and Evaluating Projects", "Work plans, operating procedures and evaluation plans are integral parts of good project management.\n\nLearn about these tools and how to create and use them.", "", "", "4:07");
                    case 4:
                        return new LessonObject("Advocating for Youth", "What makes for a practical and realistic response to challenges that today’s youth face? Learn how to identify these challenges, engage the relevant stakeholders and galvanize people to act.", "", "", "4:56");
                }
            case "Community Organizing for Action":
                switch (position) {
                    case 1:
                        return new LessonObject("Attracting and Motivating Volunteers", "A strong body of volunteers can make the difference between success and failure.\n\nLearn how to recruit and retain volunteers who are committed to your organization’s mission.", "", "", "3:42");
                    case 2:
                        return new LessonObject("Inspiring Community Participation", "This lesson demonstrates how to inspire citizens to take positive actions on their collective behalf and maintain their involvement for the long term.", "", "", "4:32");
                    case 3:
                        return new LessonObject("Engaging Your Community", "Community engagement is about involving the people you serve as beneficiaries and as partners in your mission.\n\nLearn about ways to foster community engagement.", "", "", "4:27");
                    case 4:
                        return new LessonObject("Creating a Successful Grassroots Campaign", "This lesson provides step-by-step recommendations for building a realistic and achievable movement for change by implementing grassroots campaigns, identifying tasks and delegating responsibility.", "", "", "5:04");
                }

                // Business
            case "Fundamentals of Starting and Running a Business":
                switch (position) {
                    case 1:
                        return new LessonObject("Developing a Business Model", "Learn how to develop business models that include a description of the target customer, an outline of an identified problem and an explanation of how a product or service will solve that problem.", "", "", "3:58");
                    case 2:
                        return new LessonObject("Creating a Business Plan", "Composing a business plan is the first and most important step in launching a business.\n\nThis lesson highlights the key elements of a business plan that will attract the right investors and help you recruit the the right team.", "", "", "4:47");
                    case 3:
                        return new LessonObject("Identifying Your Markets", "To develop a successful product, entrepreneurs need to examine the market in which they want to operate.\n\nThey also must be able to identify their potential customers and their personal strengths and weaknesses, then structure their business accordingly.", "", "", "5:00");
                    case 4:
                        return new LessonObject("Pitching Your Business Ideas for Investment", "Most entrepreneurs will require funders who are willing to put financial resources toward an idea.\n\nThis lesson will introduce some of the best practices for developing your pitch to potential investors.", "", "", "4:52");
                }
            case "Fundamentals of Business Expansion":
                switch (position) {
                    case 1:
                        return new LessonObject("Raising Capital", "The type of capital you need and where you get it depends on the type of business you run and the market you operate in.\n\nLearn about different types of capital and when to seek it.", "", "", "4:15");
                    case 2:
                        return new LessonObject("Growing Your Business", "To grow your business, it is crucial to find the right product for the right market.\n\nThis video will teach you the best ways to find, keep and grow a customer base.", "", "", "4:04");
                    case 3:
                        return new LessonObject("Growing Your Startup", "Growth is the key to a successful business.\n\nThis lesson will help you to identify the right time to expand a business and find new capital markets.", "", "", "5:05");
                }

                // Management
            case "Basics of Public-Private Partnerships":
                switch (position) {
                    case 1:
                        return new LessonObject("Initiating a Public-Private Partnership", "Public-private partnerships borrow the best attributes of each sector.\n\nLearn more about the advantages of a public-private partnership and how to initiate one.", "", "", "4:00");
                    case 2:
                        return new LessonObject("Implementing a Public-Private Partnership", "Public-private partnerships can accomplish much more together than could one organization alone.\n\nTo maximize impact, learn how to implement a partnership with clarity, accountability, focus and strong leadership.", "", "", "3:48");
                    case 3:
                        return new LessonObject("Evaluating a Public-Private Partnership", "To ensure a successful public-private partnership, evaluations must have a clear logic model, goals, and measures, and must be closely monitored to ensure the desired outputs and impacts are achieved.\n\nLearn about these important features and how to evaluate a public-private partnership.", "", "", "4:05");
                }
            case "Strengthening Public Sector Service":
                switch (position) {
                    case 1:
                        return new LessonObject("Establishing Professional Ethics in Government", "An ethical public servant is committed to transparency and objectivity.\n\nThis lesson examines a few ways elected officials and civil servants can work to avoid situations that can lead to ethical lapses.", "", "", "3:31");
                    case 2:
                        return new LessonObject("Becoming an Effective Public Servant", "After being elected to public office, how does one ensure that the needs of the community are being met? This video provides advice from Allison Silberberg, vice mayor of the city of Alexandria, Virginia.", "", "", "4:09");
                    case 3:
                        return new LessonObject("Communicating with the Public", "This lesson examines the tools needed for elected officials and public servants to establish accurate, efficient, responsive and varied channels of communication with the citizens they serve.", "", "", "3:26");
                }

                // Mandela
            case "Fundraising Concepts":
                switch (position) {
                    case 1:
                        return new LessonObject("Developing a Fundraising Plan", "This lesson provides an overview and necessary actions that should be included in a strategic fundraising plan and how to ensure the plan is successful.", "", "", "6:31");
                    case 2:
                        return new LessonObject("Components of a Fundraising Plan", "This lesson outlines the five components of a fundraising plan (Executive Summary, organization business structure, list of goals and objectives, organization’s timeline and budget, and an overview of the marketing strategy).", "", "", "5:18");
                    case 3:
                        return new LessonObject("Marketing and Communication Plan", "This lesson illustrates how to create a marketing and communication plan to create greater awareness about a fundraising campaign among potential investors.", "", "", "3:12");
                    case 4:
                        return new LessonObject("Funding Opportunities for Non-profit Organizations", "In this lesson, funding opportunities and resources that are specifically available in the various non-profit sectors are reviewed.", "", "", "4:27");
                    case 5:
                        return new LessonObject("Funding Opportunities for For-profit Organizations", "In this lesson, funding opportunities and resources that are specifically available in the for-profit sector are discussed.", "", "", "5:20");
                }
            case "Design Driven Entrepreneurship":
                switch (position) {
                    case 1:
                        return new LessonObject("Design Driven Entrepreneurship", "This lesson introduces the idea of human-centered design and how to define an entrepreneur’s 'big idea'.", "", "", "4:50");
                    case 2:
                        return new LessonObject("Value Proposition", "This lesson examines the value proposition and how to develop the 'quick pitch.'", "", "", "6:52");
                    case 3:
                        return new LessonObject("Bring Your Big Idea to Life", "This lesson reviews the “stakeholder map” and the relationships between different stakeholders.", "", "", "6:01");
                    case 4:
                        return new LessonObject("Creating a Prototype", "This final lesson reveals how to properly create and test a prototype of the 'big idea.'", "", "", "5:30");
                }
            case "Servant Leadership – The Deciding Difference":
                switch (position) {
                    case 1:
                        return new LessonObject("What is Servant Leadership", "This lesson covers the basics of leadership, the origins of servant leadership, and when to apply this style of management in organizations.", "", "", "4:40");
                    case 2:
                        return new LessonObject("Five Key Styles of Leadership", "This lesson discusses five styles of leadership and how the concept of servant leadership compares.", "", "", "4:33");
                    case 3:
                        return new LessonObject("Ten Principles of Servant Leadership", "This lesson outlines the behaviors and qualities of servant leadership, as defined by the originator of the concept, Robert Greenleaf.", "", "", "6:32");
                    case 4:
                        return new LessonObject("Advantages of Servant Leadership", "This lesson explores the benefits and criticisms of servant leadership for organizations and governments.", "", "", "4:34");
                    case 5:
                        return new LessonObject("Putting Servant Leadership Into Action", "This lesson focuses on taking the principles of servant leadership and applying them to your daily life.", "", "", "4:29");
                }
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
