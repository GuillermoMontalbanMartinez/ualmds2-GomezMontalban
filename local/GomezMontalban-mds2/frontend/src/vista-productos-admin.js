import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-producto-admin.js';

class VistaProductosAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-producto-admin></vista-producto-admin>
 <vista-producto-admin></vista-producto-admin>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productos-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosAdmin.is, VistaProductosAdmin);
