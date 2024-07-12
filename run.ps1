# Define the commands
$compile = "javac -d bin .\src\*.java"

# Prompt the user to choose which Java application to run
$choice = Read-Host "Which Java application do you want to run? Enter 'Main' or 'Gui' or enter file name which contain it's own main function"

# Set the run command based on user input
# if ($choice -eq "Main") {
#     $run = "java -cp bin Main"
# } elseif ($choice -eq "Gui") {
#     $run = "java -cp bin Gui"
# } else {
#     Write-Host "Invalid choice. Exiting script."
#     exit
# }
if ($choice -eq "") {
    ""
    Write-Host "ERROR: empty file name." -ForegroundColor Red
    exit
}
$run = "java -cp bin $choice"
""
# Execute the commands
Invoke-Expression $compile
Invoke-Expression $run
