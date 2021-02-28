import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-admin`
 *
 * VistaProductosAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosAdmin extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
