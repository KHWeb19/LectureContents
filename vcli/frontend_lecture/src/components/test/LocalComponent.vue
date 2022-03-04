<template>
    <div>
        {{ num }}
    </div>
</template>

<script>

export default {
    name: 'LocalComponent',
    props: {
        num: Number
    }
}

</script>