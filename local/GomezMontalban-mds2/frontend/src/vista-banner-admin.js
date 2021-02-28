import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-banner-admin`
 *
 * VistaBannerAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaBannerAdmin extends PolymerElement {

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
        return 'vista-banner-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerAdmin.is, VistaBannerAdmin);
