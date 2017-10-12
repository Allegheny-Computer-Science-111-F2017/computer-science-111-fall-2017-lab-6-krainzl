# Reflection by Leah Krainz

## 12 October 2017

I greatly enjoyed this lab assignment because it involves biology, my major and
a discipline that I find fascinating. The input was a text file with a DNA
sequence. The output was the compliment, a random insertion, a random deletion,
and a random substitution. Additional output included my name and date, as well
as a thank you message. To generate the compliment, I had to find a way to
replace the bases with their corresponding base pair but "mark" the ones that
were replacements and not the original sequence. To do this, I replaced the
inputted string, in lowercase, with uppercase pairs. Thus, lowercase chars
would be changed to uppercase chars and uppercase chars would not be modified.
To insert a randomly chosen base, I generated a random int that represented the
index and generated a random char from the options ATGC, the possible DNA
bases. To do a random deletion, I used the string builder tool to delete at a
randomly generated index. Similarly, I used the string builder tool to cause a
random substitution by saying the index in which substitution will occur
(random number) and base (random char). Some of the new commands that were
useful were .replace(), Random(), setting the bounds of which indexes could be
chosen (.nextInt()), setting the bounds of which chars can be chosen randomly
"limits".charAt(), delete.deleteCharAt(), and .setCharAt(). Many TAs were
guiding us to break the string randomly and perform deletions this way. This
felt more confusing to me when it would be easier to say what index was to be
cut. Google searches led me to the StringBuilder commands. These made more
sense to me and required less typing. I want to learn more about what the
StringBuilder commands include, as I am sure they are useful.
