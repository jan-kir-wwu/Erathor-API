# Start from a base image
FROM openjdk:17-jdk-alpine

# Install necessary utilities
RUN apk update && apk add curl bash

# Create a directory for PaperMC
WORKDIR /minecraft

# Download the PaperMC server
RUN curl -o paperclip.jar https://papermc.io/api/v2/projects/paper/versions/1.19.4/builds/545/downloads/paper-1.19.4-545.jar

# Accept the EULA
RUN echo "eula=true" > eula.txt

# The application's jar file
ARG JAR_FILE=target/ErathorCore-1.0-shaded.jar

# Copy the plugin .jar file to the plugins directory
COPY ${JAR_FILE} ./plugins/ErathorCore.jar

# Expose the default server port
EXPOSE 25565

# Agree to the EULA
ENV EULA=TRUE

# Run the PaperMC server
CMD java -Xms1G -Xmx1G -jar paperclip.jar nogui
