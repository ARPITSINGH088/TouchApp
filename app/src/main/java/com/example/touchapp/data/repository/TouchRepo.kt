package com.example.touchapp.data.repository

import com.example.touchapp.data.model.PostData
import com.example.touchapp.data.model.StoryData

class TouchRepo {
    fun getStories(): List<StoryData> = listOf(

        StoryData("Ansh", "https://i.imgflip.com/1bij.jpg"),
        StoryData("Pepsu", "https://content.imageresizer.com/images/memes/Suspicious-Dog-meme-1.jpg"),
        StoryData("Yash", "https://media.tenor.com/Eu03ypsoM3gAAAAM/dog-tongue-out.gif"),
        StoryData("Arpit", "https://content.imageresizer.com/images/memes/Suspicious-Dog-meme-1.jpg"),
        StoryData("Raju", "https://media.tenor.com/elPYP8YQVOAAAAAM/vest-dog.gif"),
        StoryData("Arpit", "https://content.imageresizer.com/images/memes/Suspicious-Dog-meme-1.jpg"),
        StoryData("Raju", "https://media.tenor.com/elPYP8YQVOAAAAAM/vest-dog.gif")
    )

    fun getPosts(): List<PostData> = listOf(
        PostData(
            id = 1,
            username = "Bhumika_123",

            profileImage = "https://picsum.photos/id/237/200/200",

            imageUrl = "https://picsum.photos/id/10/600/600",
            likes = "67",
            comments = "15",
            description = "Aaj kuch toofaani krte h ",
            location = "Jaipur, Rajasthan",
            date = "1 Nov 2025"
        ),
        PostData(
            id = 2,
            username = "arpit_123",

            profileImage = "https://picsum.photos/id/40/200/200",

            imageUrl = "https://picsum.photos/id/1025/600/600",
            likes = "500k",
            comments = "350k",
            description = "Thala Paglu",
            location = "Delhi, India",
            date = "1 Nov 2025"
        ),
        PostData(
            id = 3,
            username = "Memerrrrrr",

            profileImage = "https://picsum.photos/id/1062/200/200",

            imageUrl = "https://i.pinimg.com/736x/06/4a/14/064a14503d5ca867b686169314e3820e.jpg",
            likes = "500k",
            comments = "350k",
            description = "What the dog doinnnn......",
            location = "swarg, Indralok",
            date = "1 Nov 2025"
        )
    )
}
