# Define the commands
$compile = "javac -d bin .\src\*.java"

# Prompt the user to choose which Java application to run
$choice = Read-Host "Which Java application do you want to run? Enter 'App' or 'gui' or enter file name which contain it's own main function"

# Set the run command based on user input
# if ($choice -eq "App") {
#     $run = "java -cp bin App"
# } elseif ($choice -eq "gui") {
#     $run = "java -cp bin gui"
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
