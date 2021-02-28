import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-categoria-admin`
 *
 * VistaCategoriaAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaCategoriaAdmin extends PolymerElement {

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
        return 'vista-categoria-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoriaAdmin.is, VistaCategoriaAdmin);
