#FROM nginx:alpine
#COPY dist/crudtuto-Front /usr/share/nginx/html
#EXPOSE 4200:80


# Use an official Node.js runtime as a parent image
FROM node:14 as builder

# Set the working directory in the container
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install Node.js dependencies
RUN npm install

# Copy the entire Angular application to the working directory
COPY . .

# Use a lightweight Nginx image to serve the Angular application
FROM nginx:alpine

# Copy the built Angular app from the 'builder' stage to the NGINX web server directory
COPY ./html/index.html /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start the Nginx web server
CMD ["nginx", "-g", "daemon off;"]

