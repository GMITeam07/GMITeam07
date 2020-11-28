
@RegistrationNewData
Feature:Registration feature with scenario outline

  Background:user is on the  new Registration Page

    Given user is on the GMIBank HomePage
    And user clicks on the Account Menu icon
    And user clicks on the Register viewbox

  Scenario Outline:testing the registration page with valid credentials in the GMI bank web page

    And user enters SSN number "<SSN>"
    And user enters firstName "<firstName>"
    And user enters lastName "<lastName>"
    And user enters address "<address>"
    And user enters mobile phone number "<mobilePhoneNumber>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters username "<newPassword>"
    And user enters email "<confirmationNewPassword>"
    Then user verifies there is no red boxes on the registration page

    Examples: test data for the registration page

      | SSN         | firstName | lastName    | address         | mobilePhoneNumber | username                       | email                           | newPassword      | confirmationNewPassword |
      | 501-69-4969 | Anthe     | Sapseed     | Kardhiq         | 802-130-0520      | Senior Editor                  | asapseed0@yellowbook.com        | 0HHmIYyC!        | 0HHmIYyC!               |
      | 714-19-9811 | Briant    | Sarsfield   | Silver Spring   | 301-141-7971      | Database Administrator III     | bsarsfield1@illinois.com        | riSBQK181zG@     | riSBQK181zG@            |
      | 868-66-9479 | Geriann   | Ralton      | Riangwale       | 739-171-5913      | Dental Hygienist               | gralton2@samsung.com            | Eh0p0FCYfR6F$    | Eh0p0FCYfR6F$           |
      | 831-34-1568 | Joye      | McMoyer     | KA.benhavn      | 181-918-0688      | Human Resources Manager        | jmcmoyer3@lycos.com             | PXKEZ5sahI.      | PXKEZ5sahI.             |
      | 738-12-6441 | Jose      | Beebis      | Leduc           | 145-339-7965      | Programmer I                   | jbeebis4@com.com                | fC0OJc!ONe       | fC0OJc!ONe              |
#      | 151-05-2775 | Cleveland | Dmitrovic   | Safotu          | 122-232-7743      | Nurse Practicioner             | cdmitrovic5@economist.com       | hc7E3h*z         | hc7E3h*z                |
#      | 635-73-3995 | Onfre     | MacRedmond  | Ghar al Mila    | 196-944-9359      | Geological Engineer            | omacredmond6@smugmug.com        | B5TS0bb7Lv>      | B5TS0bb7Lv>             |
#      | 773-22-3661 | Bunny     | Whiteway    | San Diego       | 619-540-7142      | Data Coordiator                | bwhiteway7@apache.com           | OTdlS9PcDh&      | OTdlS9PcDh&             |
#      | 295-16-8392 | Marsiella | Cullen      | San Jose        | 274-646-2021      | VP Accounting                  | mcullen8@ustream.com            | 10acx4Fz-WCGn    | 10acx4Fz-WCGn           |
#      | 838-92-4929 | Berti     | Mazdon      | Shunling        | 337-511-6084      | Senior Sales Associate         | bmazdon9@devhub.com             | djO3nWaWAm%      | djO3nWaWAm%             |
#      | 380-87-0787 | Ranna     | Vann        | Boston          | 781-111-9036      | Occupational Therapist         | rvanna@soundcloud.com           | uxqlQofl9eLd/    | uxqlQofl9eLd/           |
#      | 455-52-7332 | Marcos    | Serchwell   | Admiralteisky   | 526-985-5388      | Computer Systems Analyst II    | mserchwellb@gnu.org             | ikyPGff6dfj9Q#   | ikyPGff6dfj9Q#          |
#      | 599-30-5267 | Selma     | Lulham      | Avreux          | 630-738-3267      | Cost Accountant                | slulhamc@instagram.com          | rx8f6A7l2+       | rx8f6A7l2+              |
#      | 778-95-9014 | Olia      | Reinard     | KAjping         | 880-634-9291      | Senior Financial Analyst       | oreinardd@google.com            | XHMrNT2wgXr      | XHMrNT2wgXr             |
#      | 395-87-9016 | Morgen    | Rider       | Jiahu           | 838-279-3476      | Financial Advisor              | mridere@seattletimes.com        | F5ad9@a4m        | F5ad9@a4m               |
#      | 317-70-1452 | Ewart     | Mac         | Anda            | 289-309-6190      | Associate Professor            | emacf@sakura.ne.com             | 47Y3GTxhY"       | 47Y3GTxhY"              |
#      | 452-54-3591 | Gaspard   | Eddowes     | Mlawe           | 857-758-0923      | Administrative Officer         | geddowesg@example.com           | xZ2B8AwT:        | xZ2B8AwT:               |
#      | 447-35-0399 | Gaynor    | Cahan       | Balbalan        | 415-801-1845      | Geological Engineer            | gcahanh@buzzfeed.com            | P5E0id]qdG       | P5E0id]qdG              |
#      | 759-39-7970 | Rockey    | Hayles      | VAYrgAYrda      | 378-247-6525      | Assistant Professor            | rhaylesi@harvard.com            | 3HKxRAqdP7og&    | 3HKxRAqdP7og&           |
#      | 416-88-3793 | George    | Batchelour  | Marne-la-VallAe | 779-679-3367      | Director of Sales              | gbatchelourj@google.com         | vP240kdHr9+      | vP240kdHr9+             |
#      | 116-14-6126 | Westbrook | Noe         | Palma Gil       | 626-820-0771      | Social Worker                  | wnoek@tumblr.com                | 5u82h8+eNBbn0    | 5u82h8+eNBbn0           |
#      | 701-17-2955 | Roselle   | Ellen       | Gongxi          | 486-504-6009      | Senior Editor                  | rellenl@networkadvertising.com  | vxawzVA>nVZPc    | vxawzVA>nVZPc           |
#      | 743-38-6238 | Brooke    | McNeill     | Kachar          | 523-764-3034      | Programmer I                   | bmcneillm@ning.com              | e2AkTpeC4:dv3y   | e2AkTpeC4:dv3y          |
#      | 492-26-7445 | Garnet    | Meads       | QuaraA          | 365-428-5570      | Staff Accountant III           | gmeadsn@latimes.com             | NF6AcScc!fDs     | NF6AcScc!fDs            |
#      | 624-26-7004 | Prescott  | Fritzer     | Bela Vista      | 716-596-1197      | Account Representative II      | pfritzero@nyu.com               | aMJyd@MetDiqo0   | aMJyd@MetDiqo0          |
#      | 777-60-5510 | Judon     | Danahar     | Acawr al BAha   | 502-617-6271      | Environmental Tech             | jdanaharp@storify.com           | AB8O1C#ZlppR     | AB8O1C#ZlppR            |
#      | 209-48-4225 | Isabeau   | Spinige     | Lins            | 855-402-1800      | Dental Hygienist               | ispinigeq@dmoz.com              | fcVE5HV$oKGQo    | fcVE5HV$oKGQo           |
#      | 508-95-2778 | Reinhold  | Basilone    | Codoi           | 409-376-6719      | Senior Financial Analyst       | rbasiloner@loc.com              | Fa9z%Yj6RiI      | Fa9z%Yj6RiI             |
#      | 637-95-8408 | Jinny     | MacMaykin   | Huangtian       | 295-518-6168      | Web Developer IV               | jmacmaykins@biglobe.ne.com      | kRghI5^dDaaqS    | kRghI5^dDaaqS           |
#      | 190-05-8906 | Salli     | Flamank     | Lidong          | 665-184-6941      | Administrative Assistant II    | sflamankt@walmart.com           | rK44X*E6NIpOM    | rK44X*E6NIpOM           |
#      | 594-26-8296 | Rollie    | Straine     | LA_bano         | 385-728-5642      | Staff Scientist                | rstraineu@fastcompany.com       | gaL(CoEdQqdSp4   | gaL(CoEdQqdSp4          |
#      | 204-09-1795 | Von       | Chomley     | Giang TrAm      | 552-439-4146      | Pharmacist                     | vchomleyv@flavors.com           | YE0I43ix)UVFqk   | YE0I43ix)UVFqk          |
#      | 885-85-7755 | Forrest   | Osgood      | Osasco          | 642-114-4178      | Geological Engineer            | fosgoodw@netlog.com             | FO8DgWjh-Ds1aAb  | FO8DgWjh-Ds1aAb         |
#      | 693-87-1008 | Kirsti    | Forte       | Carmen          | 201-555-4385      | VP Marketing                   | kfortex@tuttocitta.com          | 75yRWV5x_td3r    | 75yRWV5x_td3r           |
#      | 237-86-4039 | Paco      | Beedle      | Shucheng Cheng  | 896-776-2749      | Information Systems Manager    | pbeedley@ucoz.com               | fpfYPc=kfqdYt    | fpfYPc=kfqdYt           |
#      | 702-66-4680 | Shela     | Tuerena     | TabAlah         | 833-421-1005      | Graphic Designer               | stuerenaz@trellian.com          | t6ESRt+CT10w4    | t6ESRt+CT10w4           |
#      | 890-37-2533 | Kore      | Dryburgh    | Gongnong        | 719-955-1114      | Financial Advisor              | kdryburgh10@nbcnews.com         | tD3Iz<jGs6RH     | tD3Iz<jGs6RH            |
#      | 599-69-4229 | Ashby     | Roget       | GyAr            | 682-378-3630      | Automation Specialist III      | aroget11@360.com                | hJwrjMi.hCQx     | hJwrjMi.hCQx            |
#      | 867-66-7483 | Mary      | Brisker     | Celorico        | 980-451-5943      | Executive Secretary            | mbrisker12@list-manage.com      | hxU8HHZN>htC     | hxU8HHZN>htC            |
#      | 114-93-2912 | Marline   | Gilliard    | Magisterial     | 175-787-6518      | Junior Executive               | mgilliard13@apache.com          | J7B1Le?UXqdj8n   | J7B1Le?UXqdj8n          |
#      | 572-33-5831 | Debbie    | Hartrick    | Hearst          | 227-495-5954      | Account Coordinator            | dhartrick14@cafepress.com       | dvi7mdvb/G3Pte   | dvi7mdvb/G3Pte          |
#      | 403-09-1707 | Lindsay   | Ceaplen     | Angkup          | 511-703-4944      | Registered Nurse               | lceaplen15@marketwatch.com      | wrFNwsns!XIMT    | wrFNwsns!XIMT           |
#      | 791-49-8550 | Mordy     | Acuna       | JAxrfAxlla      | 679-723-4305      | Assistant Media Planner        | macuna16@i2i.com                | dPyc8q	hF5Pj1s   | dPyc8q	hF5Pj1s          |
#      | 810-21-3896 | Aurel     | Caser       | Sukakerta       | 739-346-4647      | Research Associate             | acaser17@un.com                 | bKVrNWaw@KZIt    | bKVrNWaw@KZIt           |
#      | 195-24-4450 | Andrea    | Dunphy      | Bafia           | 559-586-9306      | VP Sales                       | adunphy18@theatlantic.com       | 6M9JOvE1#cQtQ    | 6M9JOvE1#cQtQ           |
#      | 294-98-8293 | Elsie     | Muldownie   | Dongda          | 536-191-6690      | General Manager                | emuldownie19@businessweek.com   | kvoK7oG$D5E0x    | kvoK7oG$D5E0x           |
#      | 158-57-7201 | Andi      | Kime        | Gulou           | 499-846-8154      | Web Designer III               | akime1a@yandex.com              | DORWbL5%2he0C    | DORWbL5%2he0C           |
#      | 685-25-2857 | Eleanora  | McGing      | Naples          | 239-780-6478      | Software Consultant            | emcging1b@vistaprint.com        | bDJQ8fc^PERBJU   | bDJQ8fc^PERBJU          |
#      | 749-76-2920 | Jaclin    | Crayton     | Hoopstad        | 118-404-7789      | Graphic Designer               | jcrayton1c@gnu.com              | UIuvCcw&11BI     | UIuvCcw&11BI            |
#      | 231-30-6715 | Fredrika  | Krienke     | Kishorganj      | 305-658-3627      | Nurse Practicioner             | fkrienke1d@mediafire.com        | 4mRhaVNp*BjqOeid | 4mRhaVNp*BjqOeid        |
#      | 463-93-5070 | Winn      | Gregson     | LAco            | 878-374-0730      | Sales Representative           | wgregson1e@sitemeter.com        | 6bP3DPAk(Jw9w    | 6bP3DPAk(Jw9w           |
#      | 419-33-6060 | Millie    | Blackwood   | Dlemer          | 600-205-7987      | Senior Editor                  | mblackwood1f@jigsy.com          | XWQmQw)3YOi5mo   | XWQmQw)3YOi5mo          |
#      | 560-38-9042 | Fairleigh | Rosenzveig  | Shimanovsk      | 228-779-2857      | Occupational Therapist         | frosenzveig1g@cbsnews.com       | 531GFq	KI6Cb1    | 531GFq	KI6Cb1           |
#      | 262-05-0452 | Giuditta  | Wheater     | Lyaskelya       | 305-693-8467      | Human Resources Assistant III  | gwheater1h@yelp.com             | MOpQ0W8?OSZZw    | MOpQ0W8?OSZZw           |
#      | 623-05-2667 | Dannie    | Sauter      | Perpignan       | 347-338-8479      | Chief Design Engineer          | dsauter1i@tinyurl.com           | s1TBe9!uTcqWFx   | s1TBe9!uTcqWFx          |
#      | 521-38-1609 | Deirdre   | Sevitt      | Heping          | 465-638-4402      | Compensation Analyst           | dsevitt1j@chronoengine.com      | lQJsC@svJ8md     | lQJsC@svJ8md            |
#      | 542-46-7485 | Abdel     | Possell     | Kertosari       | 247-298-6967      | Human Resources Assistant IV   | apossell1k@blog.com             | iOVn3$VHhR       | iOVn3$VHhR              |
#      | 355-62-3316 | Brigit    | Boulder     | Vrbovec         | 728-925-8131      | Civil Engineer                 | bboulder1l@mozilla.com          | RQF6QiM!KXOm     | RQF6QiM!KXOm            |
#      | 804-21-6046 | Melloney  | Goodbourn   | KlAterec nad    | 917-160-8344      | Professor                      | mgoodbourn1m@dyndns.com         | xb30Tc@KxpuU57q  | xb30Tc@KxpuU57q         |
#      | 363-48-1650 | Travers   | Iapico      | La Esperanza    | 183-505-4905      | Recruiter                      | tiapico1n@digg.com              | vmn0wgK#y35      | vmn0wgK#y35             |
#      | 398-51-3844 | Wheeler   | Chadwyck    | Huangmao        | 484-948-1912      | VP Product Management          | wchadwyck1o@ameblo.com          | 16R6OzsJlrQ0$    | 16R6OzsJlrQ0$           |
#      | 253-58-7566 | Marcelia  | De Moreno   | Los Lotes       | 582-354-3979      | Graphic Designer               | mdemoreno1p@amazon.co.com       | U0cZ8t4W%        | U0cZ8t4W%               |
#      | 280-96-5613 | Harlan    | Flacke      | Chastyye        | 762-885-3190      | Developer III                  | hflacke1q@github.com            | fbhjq2SGK^zF     | fbhjq2SGK^zF            |
#      | 259-71-5133 | Hermy     | Orchard     | MelAki          | 891-358-6745      | Programmer Analyst II          | horchard1r@google.com           | ABZgijO9Ex&gO    | ABZgijO9Ex&gO           |
#      | 824-18-7686 | Nahum     | Galsworthy  | Kindu           | 544-378-7709      | Associate Professor            | ngalsworthy1s@ucsd.com          | dLBSMNz*G9UFA    | dLBSMNz*G9UFA           |
#      | 746-43-6225 | Merralee  | Carreyette  | Toulon          | 487-181-3277      | Developer II                   | mcarreyette1t@europa.com        | hs1scwiG(O       | hs1scwiG(O              |
#      | 582-69-7438 | Cyndi     | Flanne      | Bondowoso       | 705-221-6188      | General Manager                | cflanne1u@vkontakte.com         | 2GV8ADrWF)iFg    | 2GV8ADrWF)iFg           |
#      | 643-05-7231 | Gerianne  | Kobierski   | Vidin           | 137-794-4460      | Web Designer II                | cmcimmie1w@walmart.com          | krgeA_sQB3y      | krgeA_sQB3y             |
#      | 580-35-3056 | Hollyanne | Garioch     | WAdling         | 730-364-6563      | Software Consultant            | hgarioch1x@nbcnews.com          | onR0Cm-po6Ue4k   | onR0Cm-po6Ue4k          |
#      | 258-93-0019 | Louella   | Mergue	El   | Soberbio        | 323-160-8921      | Analog Circuit Design manage   | lmergue1y@marriott.com          | BGo1K=q6j        | BGo1K=q6j               |
#      | 344-80-0623 | Dewie     | Ghelardoni  | Otaru           | 309-170-1133      | Project Manager                | dghelardoni1z@seesaa.com        | cTh5!z3WZT7R     | cTh5!z3WZT7R            |
#      | 386-68-3417 | Ugo       | Tackley     | Otrokovice      | 668-948-4365      | Civil Engineer                 | utackley20@google.com.com       | MLC7Vy@saxYb     | MLC7Vy@saxYb            |
#      | 237-16-5036 | Dudley    | Tranckle    | Zolotyy Potik   | 939-960-5727      | Chemical Engineer              | dtranckle21@squidoo.com         | ubCiMH%b36L6     | ubCiMH%b36L6            |
#      | 574-08-6798 | Daniella  | Locock      | Nubma           | 821-388-5636      | Payment Adjustment Coordinator | dlocock22@wordpress.com         | CQz9AHXbXP?      | CQz9AHXbXP?             |
#      | 322-01-9634 | Hillie    | Nanson      | Managua         | 256-193-4008      | Senior Sales Associate         | hnanson23@fotki.com             | eVDyY:7OxSFN     | eVDyY:7OxSFN            |
#      | 869-16-1236 | Cybill    | Sirett      | Jiading         | 417-880-5502      | Associate Professor            | csirett24@flavors.com           | RMiTFj+852       | RMiTFj+852              |
#      | 572-25-3717 | Paulita   | Buyers      | Shahre Jadide   | 903-476-1086      | Payment Adjustment             | pbuyers25@columbia.com          | BsEH9n9=syCY     | BsEH9n9=syCY            |
#      | 699-82-0859 | Justen    | Pina        | Cikadu          | 451-843-3905      | Human Resources Manager        | jpina26@irs.com                 | R9j1n<Xswm98     | R9j1n<Xswm98            |
#      | 810-41-7306 | Ina       | Ormshaw     | Montpellier     | 103-134-3758      | Help Desk Technician           | iormshaw27@issuu.com            | j6Am!p1JIO       | j6Am!p1JIO              |
#      | 839-01-2842 | Philly    | Hessay      | Nossa Senhora   | 439-335-0087      | Automation Specialist II       | phessay28@domainmarket.com      | FZ8V2W!lyN       | FZ8V2W!lyN              |
#      | 668-24-8055 | Chandra   | Tunno       | AmpelAkia       | 309-956-1322      | Director of Sales              | ctunno29@spiegel.com            | 4Ck3B6v/6Sbv     | 4Ck3B6v/6Sbv            |
#      | 231-88-8720 | Robin     | Knighton    | CurumanA        | 634-304-3237      | Financial Analyst              | rknighton2a@typepad.com         | upbIXGm]1        | upbIXGm]1               |
#      | 201-03-9201 | Derron    | Lancaster   | Ticrapo         | 387-759-4285      | Staff Scientist                | dlancaster2b@google.com         | 9tGZlO[Ntic      | 9tGZlO[Ntic             |
#      | 443-21-7757 | Rinaldo   | Pankettman  | Trancas         | 220-904-7811      | Media Manager II               | rpankettman2c@deliciousdays.com | kGfU5kS\jE       | kGfU5kS\jE              |
#      | 323-50-3589 | Yehudit   | Dobbie      | Palanas         | 597-405-5135      | Financial Advisor              | ydobbie2d@adobe.com             | 4W2LI.dntM9      | 4W2LI.dntM9             |
#      | 440-39-9987 | Nikkie    | Sibbering   | Dubova(Driloni) | 595-357-2484      | Desktop Support Technician     | nsibbering2e@tinypic.com        | MpuzA6*IdxN      | MpuzA6*IdxN             |
#      | 617-16-2216 | Belle     | Taggerty    | ThaiTrain       | 249-702-5561      | Dental Hygienist               | btaggerty2f@newyorker.com       | R9jU29wi>Nw6     | R9jU29wi>Nw6            |
#      | 856-75-5772 | Byron     | Berard      | Houk            | 697-891-5391      | Programmer I                   | bberard2g@samsung.com           | SI3do;Dw3x2tt    | SI3do;Dw3x2tt           |
#      | 709-29-9407 | Randal    | Gurwood     | Hechuan         | 886-939-3706      | Recruiting Manager             | rgurwood2h@wordpress.com        | xwvfq+IG5fRX     | xwvfq+IG5fRX            |
#      | 357-76-8409 | Glenna    | Ladds       | BambuA          | 709-277-5780      | Occupational Therapist         | gladds2i@marriott.com           | a2F4xg-bPu5      | a2F4xg-bPu5             |
#      | 658-43-3441 | Earle     | Backshell   | Detusoko        | 498-375-0507      | Web Designer I                 | ebackshell2j@reference.com      | QHQXgWt@tUc3     | QHQXgWt@tUc3            |
#      | 686-35-7456 | Fidelio   | Backshell   | Krasnyy Luch    | 860-484-1827      | Speech Pathologist             | fbackshell2k@apple.com          | bNm0RlX3!        | bNm0RlX3!               |
#      | 746-04-8867 | Augustina | Slott       | Zhongcun        | 814-857-9431      | Project Manager                | aslott2l@yellowpages.com        | 968vgZXN1!       | 968vgZXN1!              |
#      | 274-05-0319 | Karyn     | Grouvel     | Rokietnica      | 823-740-1458      | Recruiting Manager             | kgrouvel2m@i2i.com              | wTCjh0kB7O0y@    | wTCjh0kB7O0y@           |
#      | 442-15-4789 | Missie    | McGavin     | VAtsina         | 308-761-5857      | Financial Advisor              | mmcgavin2n@canalblog.com        | vT3uYUb4xvx#     | vT3uYUb4xvx#            |
#      | 181-42-9878 | Charis    | Jeppensen   | Staryy Oskol    | 331-855-4128      | VP Product Management          | cjeppensen2q@comcast.com        | WmlMN7Ujv2$      | WmlMN7Ujv2$             |
#      | 719-33-4988 | Mabelle   | Streatfield | Cerro Punta     | 626-678-4608      | Health Coach III               | mstreatfield2r@indiegogo.com    | xw5OCxGUFsn%     | xw5OCxGUFsn%            |
