Music Application     

User Stories
​
* As a user when i want to be able to check what songs i have in the playlist
​
  Given I am a user 
  When i create a new playlist
  Then I should see it as empty
​
* As a user i want to be able to add songs to my playlist
​
  Given I have a playlist
  When i add a song to my playlist
  Then i should see it in my playlist
​
  Given I have a playlist
  When i add multiple songs
  Then i should see them in my playlist
​
* As a user I should be able to remove a song from my playlist
​
  Given I have a playlist with songs
  When I remove a song 
  Then I should not see that song in my playlist
​
* As a user I should be able to delete my playlist
​
  Given I have multiple playlists 
  When I delete a specific playlist
  Then That playlist should be removed from my user account
​
* As a user I should be able to rearrange the songs in my playlist
​
  Given I have a playlist
  When a rearrange songs in my playlist
  Then I should be able to see the updated order in my playlist
​
* As an Admin I should be able to create songs that will be available for the users
​
  Given I am an Admin
  When I add a new song with name, type and artist to the Music library
  Then I should be able to see that song in the library
​
* As an Admin I should be able to delete a song from the Music library
​
  Given there are songs in the library
  When I delete a song
  Then it should be removed from the library 
​
* As a user I should be able to search the music library 
​
  Given there are songs in the library
  When I search for a song with name,type and artist
  Then I should be able to retrieve that song
​
* As a user I want to be able to see songs in my playlist
​
  Given there are songs in the playlist
  When I check my playlist
  Then I should be able to see the name, type and artist of the songs