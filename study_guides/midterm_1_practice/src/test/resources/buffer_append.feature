Feature: Buffer.append(String str)

Background:
Given a Buffer from "cat"

Scenario: After "nip" is appended to Buffer, the Buffer contains "catnip".
When I append "nip" to the Buffer
Then the Buffer contains "catnip"

Scenario: After "nip" is appended to Buffer and "rehab" is appended to Buffer, the Buffer contains "catniprehab".
When I append "nip" to the Buffer
Then the Buffer contains "catnip"
When I append "rehab" to the Buffer
Then the Buffer contains "catniprehab"