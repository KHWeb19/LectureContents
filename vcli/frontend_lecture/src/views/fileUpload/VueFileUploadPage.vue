<template>
    <div>
        <v-container>
            <h3>Vue 파일 업로드 </h3>
            <div>
                <label>Files
                    <input type="file" id="files" ref="files" 
                            multiple v-on:change="handleFileUpload()"/>
                </label>
                <button v-on:click="submitFiles()">파일 업로드</button>
            </div>
        </v-container>
    </div>
</template>

<script>

import axios from 'axios'

export default {
    name: 'VueFileUploadPage',
    data () {
        return {
            files: ''
        }
    },
    methods: {
        handleFileUpload () {
            this.files = this.$refs.files.files
        },
        submitFiles () {
            let formData = new FormData()

            for (let idx = 0; idx < this.files.length; idx++) {
                formData.append('fileList', this.files[idx])
            }

            axios.post('http://localhost:7777/file/uploadImg', formData, {
                headers: {
                    'Content-Type': 'multipart/form-data'
                }
            })
            .then (res => {
                this.response = res.data
            })
            .catch (res => {
                this.response = res.message
            })

            alert('처리 완료!')
        }
    }
}

</script>